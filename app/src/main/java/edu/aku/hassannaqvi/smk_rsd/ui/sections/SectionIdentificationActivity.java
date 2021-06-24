package edu.aku.hassannaqvi.smk_rsd.ui.sections;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.core.MainApp;
import edu.aku.hassannaqvi.smk_rsd.data.model.Form;
import edu.aku.hassannaqvi.smk_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySectionIdentificationBinding;
import edu.aku.hassannaqvi.smk_rsd.models.Districts;
import edu.aku.hassannaqvi.smk_rsd.models.HealthFacilities;
import edu.aku.hassannaqvi.smk_rsd.utils.DateUtilsKt;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class SectionIdentificationActivity extends AppCompatActivity {
    ActivitySectionIdentificationBinding bi;
    private final String mon = new SimpleDateFormat("MMM-yyyy").format(new Date().getTime());
    private List<String> hfNames, districtNames, reportingMonth;
    private List<String> hfCodes, districtCodes;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_identification);
        db = MainApp.appInfo.dbHelper;

        setupSkips();
        setSupportActionBar(bi.toolbar);
        populateSpinner(this);


    }


    private void setupSkips() {

    }


    private void saveDraft() {

        //if (!form.getId().equals("")) return;

        form = new Form();
        form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        form.setUserName(MainApp.userName);
        form.setDeviceId(MainApp.appInfo.getDeviceID());
        form.setDeviceTag(MainApp.appInfo.getTagName());
        form.setAppver(MainApp.appInfo.getAppVersion());

        form.setDistrictName(bi.distname.getSelectedItem().toString());
        form.setDistrictCode(districtCodes.get(bi.distname.getSelectedItemPosition()));

        form.setHfName(bi.facilityname.getSelectedItem().toString());
        form.setHfCode(hfCodes.get(bi.facilityname.getSelectedItemPosition()));

        form.setReportingMonth(bi.reportingmonth.getText().toString().isEmpty() ? "-1" : bi.reportingmonth.getText().toString());
        form.setReportingYear(bi.reportingyear.getText().toString().isEmpty() ? "-1" : bi.reportingyear.getText().toString());

    }


    private boolean addForm() {

        //if (!form.get_ID().equals("")) return true;

        long rowid = db.addForm(form);
        form.setId(String.valueOf(rowid));
        if (rowid > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(Form.FormsTable.COLUMN_UID, form.getUid());
            return true;
        } else {
            Toast.makeText(this, "Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;

        if (!hfFormExists()) {
            saveDraft();
        }
        // if (addForm()) {
        finish();
        startActivity(new Intent(this, RegisterActivity.class));
        //}
    }


    public void BtnEnd(View view) {
        //AppUtilsKt.contextEndActivity(this);
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void populateSpinner(final Context context) {


        reportingMonth = new ArrayList<>();
        reportingMonth.add("....");
        //reportingMonth.add(mon.toUpperCase());
        reportingMonth.add(DateUtilsKt.getMonthsBack("MMM-yyyy", -1).toUpperCase());
        reportingMonth.add(DateUtilsKt.getMonthsBack("MMM-yyyy", -2).toUpperCase());
        reportingMonth.add(DateUtilsKt.getMonthsBack("MMM-yyyy", -3).toUpperCase());
        // Creating adapter for spinner
        ArrayAdapter<String> monAdapter = new ArrayAdapter<>(context,
                android.R.layout.simple_spinner_dropdown_item, reportingMonth);
        // Drop down layout style - list view
        monAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        bi.reportMonth.setAdapter(monAdapter);
        bi.reportMonth.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                String[] s = bi.reportMonth.getSelectedItem().toString().split("-");
                bi.reportingmonth.setText(s[0]);
                bi.reportingmonth.setEnabled(false);
                bi.reportingyear.setText(s[1]);
                bi.reportingyear.setEnabled(false);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        districtNames = new ArrayList<>();
        districtCodes = new ArrayList<>();

        districtNames.add("....");
        districtCodes.add("....");

        //Collection<HealthFacilities> dc = db.getAllTehsils(MainApp.DIST_ID);
        ArrayList<Districts> dc = db.getAllDistricts();

        for (Districts d : dc) {
            districtNames.add(d.getDistrictName());
            districtCodes.add(d.getDistrictCode());
        }

        bi.distname.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, districtNames));


        bi.distname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;

                hfNames = new ArrayList<>();
                hfCodes = new ArrayList<>();

                hfNames.add("....");
                hfCodes.add("....");

                ArrayList<HealthFacilities> pc = db.getHfByDist(districtCodes.get(position));
                for (HealthFacilities p : pc) {
                    hfNames.add(p.getHf_name());
                    hfCodes.add(p.getHfcode());
                }

                bi.facilityname.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, hfNames));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        bi.facilityname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                //Toast.makeText(Section01Activity.this, String.valueOf(hfCodes.get(bi.a13.getSelectedItemPosition())), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    private boolean hfFormExists() {
        form = new Form();
        form = db.getFormByHF(hfCodes.get(bi.facilityname.getSelectedItemPosition()), bi.reportingmonth.getText().toString(), bi.reportingyear.getText().toString());
        return form != null;
    }
}