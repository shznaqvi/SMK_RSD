package edu.aku.hassannaqvi.smk_rsd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.smk_rsd.core.AndroidManager;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionCFPActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionEPIActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionFPRActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionIdentificationActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionMHRActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionOBSActivity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.SectionSHFActivity;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*public void sectionPress(View view) {
        finish();
        startActivity(new Intent(this, SectionIdentificationActivity.class));
    }*/


    public void sectionPress(View v) {
        Intent oF = null;
        switch (v.getId()) {
            case R.id.openForm:
                oF = new Intent(this, SectionIdentificationActivity.class);
                break;
            case R.id.sec1:
                oF = new Intent(this, SectionMHRActivity.class);
                break;
            case R.id.sec2:
                if (form == null)
                    oF = new Intent(this, SectionEPIActivity.class);
                break;
            case R.id.sec3:
                if (form == null)
                    oF = new Intent(this, SectionSHFActivity.class);
                break;
            case R.id.sec4:
                if (form == null)
                    oF = new Intent(this, SectionOBSActivity.class);
                break;
            case R.id.sec5:
                if (form == null)
                    oF = new Intent(this, SectionFPRActivity.class);
                break;
            case R.id.onhold:
                if (form == null)
                    oF = new Intent(this, SectionCFPActivity.class);
                break;
            case R.id.openDBManager:
                if (form == null)
                    oF = new Intent(this, AndroidManager.class);
                break;
        }
        //finish();
        startActivity(oF);
    }


}