package edu.aku.hassannaqvi.smk_rsd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.data.model.Form;
import edu.aku.hassannaqvi.smk_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySectionMhrBinding;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.appInfo;
import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;


public class SectionMHRActivity extends AppCompatActivity {
    ActivitySectionMhrBinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_mhr);
        setupSkips();
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.mhr_mainheading);
    }


    private void setupSkips() {

    }


    private void saveDraft() {

        form.setMhr01(bi.mhr01.getText().toString().isEmpty() ? "-1" : bi.mhr01.getText().toString());
        form.setMhr0197(bi.mhr0197.isChecked() ? "97" : "-1");

        form.setMhr02(bi.mhr02.getText().toString().isEmpty() ? "-1" : bi.mhr02.getText().toString());
        form.setMhr0297(bi.mhr0297.isChecked() ? "97" : "-1");

        form.setMhr03(bi.mhr03.getText().toString().isEmpty() ? "-1" : bi.mhr03.getText().toString());
        form.setMhr0397(bi.mhr0397.isChecked() ? "97" : "-1");

        form.setMhr04(bi.mhr04.getText().toString().isEmpty() ? "-1" : bi.mhr04.getText().toString());
        form.setMhr0497(bi.mhr0497.isChecked() ? "97" : "-1");

        form.setMhr05(bi.mhr05.getText().toString().isEmpty() ? "-1" : bi.mhr05.getText().toString());
        form.setMhr0597(bi.mhr0597.isChecked() ? "97" : "-1");

    }


    private boolean updateDB() {
        DatabaseHelper db = appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_SMHR, form.sMHRtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        if (!addForm()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            //startActivity(new Intent(this, RegisterActivity.class));
        }
    }


    public void BtnEnd(View view) {
        finish();
        startActivity(new Intent(this, RegisterActivity.class));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    private boolean addForm() {
        if (!form.getId().equals("")) return true;
        DatabaseHelper db = appInfo.dbHelper;
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

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }


}