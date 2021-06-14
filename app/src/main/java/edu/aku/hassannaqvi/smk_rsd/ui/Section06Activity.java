package edu.aku.hassannaqvi.smk_rsd.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySection06Binding;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class Section06Activity extends AppCompatActivity {
    ActivitySection06Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section06);
        setupSkips();
    }


    private void setupSkips() {

    }


    private void saveDraft() {

        form.setFpr01(bi.fpr01.getText().toString().isEmpty() ? "-1" : bi.fpr01.getText().toString());
        form.setFpr0197(bi.fpr0197.isChecked() ? "97" : "-1");

        form.setFpr02(bi.fpr02.getText().toString().isEmpty() ? "-1" : bi.fpr02.getText().toString());
        form.setFpr0297(bi.fpr0297.isChecked() ? "97" : "-1");

        form.setFpr03(bi.fpr03.getText().toString().isEmpty() ? "-1" : bi.fpr03.getText().toString());
        form.setFpr0397(bi.fpr0397.isChecked() ? "97" : "-1");

        form.setFpr04(bi.fpr04.getText().toString().isEmpty() ? "-1" : bi.fpr04.getText().toString());
        form.setFpr0497(bi.fpr0497.isChecked() ? "97" : "-1");

        form.setFpr05(bi.fpr05.getText().toString().isEmpty() ? "-1" : bi.fpr05.getText().toString());
        form.setFpr0597(bi.fpr0597.isChecked() ? "97" : "-1");

        form.setFpr06(bi.fpr06.getText().toString().isEmpty() ? "-1" : bi.fpr06.getText().toString());
        form.setFpr0697(bi.fpr0697.isChecked() ? "97" : "-1");

        form.setFpr07(bi.fpr07.getText().toString().isEmpty() ? "-1" : bi.fpr07.getText().toString());
        form.setFpr0797(bi.fpr0797.isChecked() ? "97" : "-1");

        form.setFpr08(bi.fpr08.getText().toString().isEmpty() ? "-1" : bi.fpr08.getText().toString());
        form.setFpr0897(bi.fpr0897.isChecked() ? "97" : "-1");

        form.setFpr09(bi.fpr09.getText().toString().isEmpty() ? "-1" : bi.fpr09.getText().toString());
        form.setFpr0997(bi.fpr0997.isChecked() ? "97" : "-1");

        form.setFpr10(bi.fpr10.getText().toString().isEmpty() ? "-1" : bi.fpr10.getText().toString());
        form.setFpr1097(bi.fpr1097.isChecked() ? "97" : "-1");

        form.setFpr11(bi.fpr11.getText().toString().isEmpty() ? "-1" : bi.fpr11.getText().toString());
        form.setFpr1197(bi.fpr1197.isChecked() ? "97" : "-1");

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