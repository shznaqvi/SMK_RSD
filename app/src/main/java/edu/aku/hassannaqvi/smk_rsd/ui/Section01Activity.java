package edu.aku.hassannaqvi.smk_rsd.ui;

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
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySection01Binding;
import edu.aku.hassannaqvi.smk_rsd.models.Districts;
import edu.aku.hassannaqvi.smk_rsd.models.HealthFacilities;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class Section01Activity extends AppCompatActivity {
    ActivitySection01Binding bi;
    private List<String> hfNames, districtNames;
    private List<String> hfCodes, districtCodes;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section01);
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
        form.setDistrictName(districtCodes.get(bi.distname.getSelectedItemPosition()));

        form.setHfName(bi.facilityname.getSelectedItem().toString());
        form.setHfName(hfCodes.get(bi.facilityname.getSelectedItemPosition()));

        form.setReportingMonth(bi.reportingmonth.getText().toString().isEmpty() ? "-1" : bi.reportingmonth.getText().toString());
        form.setReportingYear(bi.reportingyear.getText().toString().isEmpty() ? "-1" : bi.reportingyear.getText().toString());

    }


    private boolean updateDB() {

        //if (!form.get_ID().equals("")) return true;

        long updcount = db.addForm(form);
        form.setId(String.valueOf(updcount));
        if (updcount > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(Form.FormsTable.COLUMN_UID, form.getUid());
            db.updatesFormColumn(Form.FormsTable.COLUMN_SA, form.sAtoString());
            return true;
        } else {
            Toast.makeText(this, "Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, Section02Activity.class));
        }
    }


    public void BtnEnd(View view) {
        //AppUtilsKt.contextEndActivity(this);
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void populateSpinner(final Context context) {

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


}