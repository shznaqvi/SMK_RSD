package edu.aku.hassannaqvi.smk_rsd.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.smk_rsd.R;

public class Section02Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section02);
    }


    private void setupSkips() {

    }


    private void saveDraft() {

    }


    public void BtnContinue(View view) {
        /*if (!formValidation()) return;
        saveDraft();
        if (UpdateDB()) {
            Toast.makeText(this, "Patient Added", Toast.LENGTH_SHORT).show();
            finish();
            gotoActivityWithPutExtra(this, SectionMobileHealth.class, "complete", true);
        }*/
    }


    public void BtnEnd(View view) {
        //AppUtilsKt.contextEndActivity(this);
    }


    private boolean formValidation() {
        /*return Validator.emptyCheckingContainer(this, bi.GrpName);*/
        return true;
    }


}