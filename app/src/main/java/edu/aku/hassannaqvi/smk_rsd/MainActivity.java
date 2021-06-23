package edu.aku.hassannaqvi.smk_rsd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.smk_rsd.core.AndroidManager;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section01Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section02Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section03Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section04Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section05Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section06Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section07Activity;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sectionPress(View v) {
        Intent oF = null;
        switch (v.getId()) {
            case R.id.openForm:
                oF = new Intent(this, Section01Activity.class);
                break;
            case R.id.sec1:
                oF = new Intent(this, Section02Activity.class);
                break;
            case R.id.sec2:
                if (form == null)
                    oF = new Intent(this, Section03Activity.class);
                break;
            case R.id.sec3:
                if (form == null)
                    oF = new Intent(this, Section04Activity.class);
                break;
            case R.id.sec4:
                if (form == null)
                    oF = new Intent(this, Section05Activity.class);
                break;
            case R.id.sec5:
                if (form == null)
                    oF = new Intent(this, Section06Activity.class);
                break;
            case R.id.onhold:
                if (form == null)
                    oF = new Intent(this, Section07Activity.class);
                break;
            case R.id.openDBManager:
                if (form == null)
                    oF = new Intent(this, AndroidManager.class);
                break;
        }
        startActivity(oF);
    }


}