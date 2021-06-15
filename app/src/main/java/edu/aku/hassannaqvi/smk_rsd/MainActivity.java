package edu.aku.hassannaqvi.smk_rsd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.smk_rsd.ui.Section01Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.Section02Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.Section03Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.Section04Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.Section05Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.Section06Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.Section07Activity;
import edu.aku.hassannaqvi.smk_rsd.ui.Section08Activity;

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
            case R.id.formA:
                oF = new Intent(this, Section01Activity.class);
                break;
            case R.id.formB:
                oF = new Intent(this, Section02Activity.class);
                break;
            case R.id.formC:
                oF = new Intent(this, Section03Activity.class);
                break;
            case R.id.formD:
                oF = new Intent(this, Section04Activity.class);
                break;
            case R.id.formE:
                oF = new Intent(this, Section05Activity.class);
                break;
            case R.id.formF:
                oF = new Intent(this, Section06Activity.class);
                break;
            case R.id.formG:
                oF = new Intent(this, Section07Activity.class);
                break;
            case R.id.formH:
                oF = new Intent(this, Section08Activity.class);
                break;
        }
        startActivity(oF);
    }


}