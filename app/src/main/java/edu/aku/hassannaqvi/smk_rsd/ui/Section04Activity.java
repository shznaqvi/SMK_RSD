package edu.aku.hassannaqvi.smk_rsd.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.core.MainApp;
import edu.aku.hassannaqvi.smk_rsd.data.model.Form;
import edu.aku.hassannaqvi.smk_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySection04Binding;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;

public class Section04Activity extends AppCompatActivity {
    ActivitySection04Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section04);
        setupSkips();
        setSupportActionBar(bi.toolbar);
    }



    private void setupSkips() {

    }


    private void saveDraft() {

        form.setShf01(bi.shf01.getText().toString().isEmpty() ? "-1" : bi.shf01.getText().toString());
        form.setShf0197(bi.shf0197.isChecked() ? "97" : "-1");

        form.setShf02(bi.shf02.getText().toString().isEmpty() ? "-1" : bi.shf02.getText().toString());
        form.setShf0297(bi.shf0297.isChecked() ? "97" : "-1");

    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = db.updatesFormColumn(Form.FormsTable.COLUMN_SA, form.sAtoString());
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "SORRY! Failed to update DB", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void BtnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, Section05Activity.class));
        }
    }


    public void BtnEnd(View view) {
        //AppUtilsKt.contextEndActivity(this);
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}