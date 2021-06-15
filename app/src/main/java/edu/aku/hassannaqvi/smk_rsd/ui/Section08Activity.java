package edu.aku.hassannaqvi.smk_rsd.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySection08Binding;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;


public class Section08Activity extends AppCompatActivity {
    ActivitySection08Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section08);
        setupSkips();
        setSupportActionBar(bi.toolbar);
    }


    private void setupSkips() {

    }


    private void saveDraft() {

        form.setStr01s(bi.str01y.isChecked() ? "1"
                : bi.str01n.isChecked() ? "2"
                : "-1");

        form.setStr01d(bi.str01d.getText().toString().isEmpty() ? "-1" : bi.str01d.getText().toString());
        form.setStr01m(bi.str01m.getText().toString().isEmpty() ? "-1" : bi.str01m.getText().toString());
        form.setStr02s(bi.str02y.isChecked() ? "1"
                : bi.str02n.isChecked() ? "2"
                : "-1");

        form.setStr02d(bi.str02d.getText().toString().isEmpty() ? "-1" : bi.str02d.getText().toString());
        form.setStr02m(bi.str02m.getText().toString().isEmpty() ? "-1" : bi.str02m.getText().toString());
        form.setStr03s(bi.str03y.isChecked() ? "1"
                : bi.str03n.isChecked() ? "2"
                : "-1");

        form.setStr03d(bi.str03d.getText().toString().isEmpty() ? "-1" : bi.str03d.getText().toString());
        form.setStr03m(bi.str03m.getText().toString().isEmpty() ? "-1" : bi.str03m.getText().toString());
        form.setStr04s(bi.str04y.isChecked() ? "1"
                : bi.str04n.isChecked() ? "2"
                : "-1");

        form.setStr04d(bi.str04d.getText().toString().isEmpty() ? "-1" : bi.str04d.getText().toString());
        form.setStr04m(bi.str04m.getText().toString().isEmpty() ? "-1" : bi.str04m.getText().toString());
        form.setStr05s(bi.str05y.isChecked() ? "1"
                : bi.str05n.isChecked() ? "2"
                : "-1");

        form.setStr05d(bi.str05d.getText().toString().isEmpty() ? "-1" : bi.str05d.getText().toString());
        form.setStr05m(bi.str05m.getText().toString().isEmpty() ? "-1" : bi.str05m.getText().toString());
        form.setStr06s(bi.str06y.isChecked() ? "1"
                : bi.str06n.isChecked() ? "2"
                : "-1");

        form.setStr06d(bi.str06d.getText().toString().isEmpty() ? "-1" : bi.str06d.getText().toString());
        form.setStr06m(bi.str06m.getText().toString().isEmpty() ? "-1" : bi.str06m.getText().toString());
        form.setStr07s(bi.str07y.isChecked() ? "1"
                : bi.str07n.isChecked() ? "2"
                : "-1");

        form.setStr07d(bi.str07d.getText().toString().isEmpty() ? "-1" : bi.str07d.getText().toString());
        form.setStr07m(bi.str07m.getText().toString().isEmpty() ? "-1" : bi.str07m.getText().toString());
        form.setStr08s(bi.str08y.isChecked() ? "1"
                : bi.str08n.isChecked() ? "2"
                : "-1");

        form.setStr08d(bi.str08d.getText().toString().isEmpty() ? "-1" : bi.str08d.getText().toString());
        form.setStr08m(bi.str08m.getText().toString().isEmpty() ? "-1" : bi.str08m.getText().toString());
        form.setStr09s(bi.str09y.isChecked() ? "1"
                : bi.str09n.isChecked() ? "2"
                : "-1");

        form.setStr09d(bi.str09d.getText().toString().isEmpty() ? "-1" : bi.str09d.getText().toString());
        form.setStr09m(bi.str09m.getText().toString().isEmpty() ? "-1" : bi.str09m.getText().toString());


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