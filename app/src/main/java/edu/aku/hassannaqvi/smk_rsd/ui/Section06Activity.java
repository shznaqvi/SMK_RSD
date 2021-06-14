package edu.aku.hassannaqvi.smk_rsd.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.data.model.Form;
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
        form = new Form();
        //form.se2001 = bi.fpr01.getText().toString().isEmpty ? "-1" : bi.fpr01.getText().toString();
        form.se2001 = bi.fpr0197.isChecked() ? "97" : "-1";

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
        /*return Validator.emptyCheckingContainer(this, bi.GrpName);*/
        return true;
    }


}