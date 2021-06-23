package edu.aku.hassannaqvi.smk_rsd.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.core.MainApp;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySectionMainBinding;
import edu.aku.hassannaqvi.smk_rsd.ui.EndingActivity;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class SectionMainActivity extends AppCompatActivity {
    public static int countG = 0;
    ActivitySectionMainBinding bi;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_main);
        bi.setCallback(this);


        /*if (!form.sAtoString().isEmpty() && !form.sBtoString().isEmpty()) {
            bi.form01.setEnabled(false);
            bi.form01.setBackgroundResource(R.color.dullWhite);
        }*/

        try {
            if (!new JSONObject(form.sAtoString()).get("mhr0597").equals("")) {
                bi.form01.setEnabled(false);
                bi.form01.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sAtoString()).get("epi0197").equals("")) {
                bi.form02.setEnabled(false);
                bi.form02.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sAtoString()).get("shf0297").equals("")) {
                bi.form03.setEnabled(false);
                bi.form03.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sAtoString()).get("obs2097").equals("")) {
                bi.form04.setEnabled(false);
                bi.form04.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sAtoString()).get("fpr1197").equals("")) {
                bi.form05.setEnabled(false);
                bi.form05.setBackgroundResource(R.color.dullWhite);
            }

            if (!new JSONObject(form.sAtoString()).get("cfp0397").equals("")) {
                bi.form06.setEnabled(false);
                bi.form06.setBackgroundResource(R.color.dullWhite);
            }

            /*if (!form.getsG().isEmpty()) {
                bi.form06.setEnabled(false);
                bi.form06.setBackgroundResource(R.color.dullWhite);
            }*/

            if (!new JSONObject(form.sAtoString()).get("str09m").equals("")) {
                bi.form07.setEnabled(false);
                bi.form07.setBackgroundResource(R.color.dullWhite);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


    public void openForm(View v) {
        //openSection(v.getId());
    }


    public void BtnContinue() {
        if (!bi.form01.isEnabled()
                && !bi.form02.isEnabled()
                && !bi.form03.isEnabled()
                && !bi.form04.isEnabled()
                && !bi.form05.isEnabled()
                && !bi.form06.isEnabled()
                && !bi.form07.isEnabled()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, "Sections still in Pending!", Toast.LENGTH_SHORT).show();
        }
    }


    public void BtnEnd() {
        if (bi.form01.isEnabled()
                || bi.form02.isEnabled()
                || bi.form03.isEnabled()
                || bi.form04.isEnabled()
                || bi.form05.isEnabled()
                || bi.form06.isEnabled()
                || bi.form07.isEnabled()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
            //MainApp.endActivity(this, EndingActivity.class).putExtra("complete", false);
        } else {
            Toast.makeText(this, "ALL SECTIONS FILLED \n Good to GO GREEN!", Toast.LENGTH_SHORT).show();
        }

    }


    public void openSection(View view) {
        Intent oF = new Intent();
        if (!MainApp.user.getUserName().equals("0000")) {
            switch (view.getId()) {
                case R.id.form01:
                    oF = new Intent(this, Section02Activity.class);
                    break;
                case R.id.form02:
                    oF = new Intent(this, Section03Activity.class);
                    break;
                case R.id.form03:
                    oF = new Intent(this, Section04Activity.class);
                    break;
                case R.id.form04:
                    oF = new Intent(this, Section05Activity.class);
                    break;
                case R.id.form05:
                    oF = new Intent(this, Section06Activity.class);
                    break;
                case R.id.form06:
                    oF = new Intent(this, Section07Activity.class);
                    break;
                case R.id.form07:
                    oF = new Intent(this, Section08Activity.class);
                    break;
            }
            startActivity(oF);
        } else {
            Toast.makeText(this, "Please login Again!", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}
