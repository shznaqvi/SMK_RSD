package edu.aku.hassannaqvi.smk_rsd.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.core.MainApp;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivityRegisterBinding;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionCFPActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionEPIActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionFPRActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionMHRActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionOBSActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionSHFActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionSTRActivity;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    ActivityRegisterBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_register);
        bi.setCallback(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume: test1");
        if (form.getiStatus().equals("1")) {
            bi.btnContinue.setVisibility(View.GONE);
            bi.btnEnd.setVisibility(View.GONE);
        }
        updateSections();

    }

    private void updateSections() {

        try {
            if (!new JSONObject(form.sMHRtoString()).get("mhr0597").equals("")) {
                bi.formMHR.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formMHR.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sEPItoString()).get("epi0197").equals("")) {
                bi.formEPI.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formEPI.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sSHFtoString()).get("shf0297").equals("")) {
                bi.formSHF.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formSHF.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sOBStoString()).get("obs2097").equals("")) {
                bi.formOBS.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formOBS.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sFPRtoString()).get("fpr1197").equals("")) {
                bi.formFPR.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formFPR.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sCFPtoString()).get("cfp0397").equals("")) {
                bi.formCFP.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formCFP.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sSTRtoString()).get("str09m").equals("")) {
                bi.formSTR.setEnabled(false);
                bi.btnEnd.setVisibility(View.VISIBLE);
                bi.formSTR.setBackgroundResource(R.color.dullWhite);
            }
            if (!bi.formMHR.isEnabled()
                    && !bi.formEPI.isEnabled()
                    && !bi.formSHF.isEnabled()
                    && !bi.formOBS.isEnabled()
                    && !bi.formFPR.isEnabled()
                    && !bi.formCFP.isEnabled()
                    && !bi.formSTR.isEnabled()
            ) bi.btnEnd.setVisibility(View.GONE);

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    public void BtnContinue() {

        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));

    }


    public void BtnEnd() {

        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        //MainApp.endActivity(this, EndingActivity.class).putExtra("complete", false);

    }


    public void openRegister(View view) {
        Intent oF = new Intent();
        if (!MainApp.user.getUserName().equals("0000")) {
            switch (view.getId()) {
                case R.id.formMHR:
                    oF = new Intent(this, SectionMHRActivity.class);
                    break;
                case R.id.formEPI:
                    oF = new Intent(this, SectionEPIActivity.class);
                    break;
                case R.id.formSHF:
                    oF = new Intent(this, SectionSHFActivity.class);
                    break;
                case R.id.formOBS:
                    oF = new Intent(this, SectionOBSActivity.class);
                    break;
                case R.id.formFPR:
                    oF = new Intent(this, SectionFPRActivity.class);
                    break;
                case R.id.formCFP:
                    oF = new Intent(this, SectionCFPActivity.class);
                    break;
                case R.id.formSTR:
                    oF = new Intent(this, SectionSTRActivity.class);
                    break;
            }
            startActivityForResult(oF, 2);
        } else {
            Toast.makeText(this, "Please login Again!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult: test1");
        updateSections();
        if (requestCode == 2
                && !bi.formMHR.isEnabled()
                && !bi.formEPI.isEnabled()
                && !bi.formSHF.isEnabled()
                && !bi.formOBS.isEnabled()
                && !bi.formFPR.isEnabled()
                && !bi.formCFP.isEnabled()
                && !bi.formSTR.isEnabled()
                && !form.getiStatus().equals("1")
        ) {
            bi.btnContinue.setVisibility(View.VISIBLE);
        } else {
            bi.btnContinue.setVisibility(View.GONE);
            //Toast.makeText(this, "Enabled!", Toast.LENGTH_SHORT).show();

        }
    }
/* @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }*/

}
