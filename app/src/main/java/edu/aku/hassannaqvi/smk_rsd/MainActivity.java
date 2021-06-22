package edu.aku.hassannaqvi.smk_rsd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section01Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section02Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section03Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section04Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section05Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section06Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section07Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.sections.Section08Activity;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openForm(View v) {
        OpenFormFunc(v.getId());
    }


    public void OpenFormFunc(int id) {
        Intent oF = null;
        switch (id) {
        /*    case R.id.formA:
                oF = new Intent(this, Section01Activity.class);
                break;
            case R.id.formB:
                oF = new Intent(this, Section02Activity.class);
                break;
            case R.id.formC:
                if (form == null)
                    oF = new Intent(this, Section03Activity.class);
                break;
            case R.id.formD:
                if (form == null)
                    oF = new Intent(this, Section04Activity.class);
                break;
            case R.id.formE:
                if (form == null)
                    oF = new Intent(this, Section05Activity.class);
                break;
            case R.id.formF:
                if (form == null)
                    oF = new Intent(this, Section06Activity.class);
                break;
            case R.id.formG:
                if (form == null)
                    oF = new Intent(this, Section07Activity.class);
                break;
            case R.id.formH:
                if (form == null)
                    oF = new Intent(this, Section08Activity.class);
                break;*/
        }
        startActivity(oF);
    }


}