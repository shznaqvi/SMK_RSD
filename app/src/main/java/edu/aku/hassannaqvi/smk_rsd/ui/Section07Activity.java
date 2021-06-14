package edu.aku.hassannaqvi.smk_rsd.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySection07Binding;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class Section07Activity extends AppCompatActivity {
    ActivitySection07Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section07);
        setupSkips();
    }


    private void setupSkips() {

    }


    private void saveDraft() {

        form.setCfp01(bi.cfp01.getText().toString().isEmpty() ? "-1" : bi.cfp01.getText().toString());
        form.setCfp0197(bi.cfp0197.isChecked() ? "97" : "-1");

        form.setCfp02(bi.cfp02.getText().toString().isEmpty() ? "-1" : bi.cfp02.getText().toString());
        form.setCfp0297(bi.cfp0297.isChecked() ? "97" : "-1");

        form.setCfp03(bi.cfp03.getText().toString().isEmpty() ? "-1" : bi.cfp03.getText().toString());
        form.setCfp0397(bi.cfp0397.isChecked() ? "97" : "-1");

    }


    private boolean updateDB() {
        return true;
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            Toast.makeText(this, "Patient Added", Toast.LENGTH_SHORT).show();
            finish();
            //gotoActivityWithPutExtra(this, SectionMobileHealth.class, "complete", true);
        }
    }


    public void BtnEnd(View view) {
        //AppUtilsKt.contextEndActivity(this);
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}