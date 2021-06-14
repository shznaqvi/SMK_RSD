package edu.aku.hassannaqvi.smk_rsd.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.core.MainApp;
import edu.aku.hassannaqvi.smk_rsd.data.model.Form;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySection01Binding;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class Section01Activity extends AppCompatActivity {
    ActivitySection01Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section01);
        setupSkips();
    }


    private void setupSkips() {

    }


    private void saveDraft() {

        form = new Form();
        form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        form.setUserName(MainApp.user.getUserName());
        form.setDeviceId(MainApp.appInfo.getDeviceID());
        form.setDeviceTag(MainApp.appInfo.getTagName());
        form.setAppver(MainApp.appInfo.getAppVersion());

        form.setDistrictCode(bi.distcode.getText().toString().trim().isEmpty() ? "-1" : bi.distcode.getText().toString());

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