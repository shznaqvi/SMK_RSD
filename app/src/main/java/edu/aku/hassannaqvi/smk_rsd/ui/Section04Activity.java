package edu.aku.hassannaqvi.smk_rsd.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySection04Binding;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class Section04Activity extends AppCompatActivity {
    ActivitySection04Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section04);
        setupSkips();
    }



    private void setupSkips() {

    }


    private void saveDraft() {

        form.setShf01(bi.shf01.getText().toString().isEmpty() ? "-1" : bi.shf01.getText().toString());
        form.setShf0197(bi.shf0197.isChecked() ? "97" : "-1");

        form.setShf02(bi.shf02.getText().toString().isEmpty() ? "-1" : bi.shf02.getText().toString());
        form.setShf0297(bi.shf0297.isChecked() ? "97" : "-1");

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