package edu.aku.hassannaqvi.smk_rsd.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivitySection05Binding;

import static edu.aku.hassannaqvi.smk_rsd.core.MainApp.form;


public class Section05Activity extends AppCompatActivity {
    ActivitySection05Binding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section05);
        setupSkips();
        setListeners();
    }

    private void setListeners() {

        bi.obs0197.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs01.setEnabled(false);
                bi.obs01.setText(null);
            } else
                bi.obs01.setEnabled(true);
        });

        bi.obs0297.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs02.setEnabled(false);
                bi.obs02.setText(null);
            } else
                bi.obs02.setEnabled(true);
        });

        bi.obs0397.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs03.setEnabled(false);
                bi.obs03.setText(null);
            } else
                bi.obs03.setEnabled(true);
        });

        bi.obs0497.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs04.setEnabled(false);
                bi.obs04.setText(null);
            } else
                bi.obs04.setEnabled(true);
        });

        bi.obs0597.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs05.setEnabled(false);
                bi.obs05.setText(null);
            } else
                bi.obs05.setEnabled(true);
        });

        bi.obs0697.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs06.setEnabled(false);
                bi.obs06.setText(null);
            } else
                bi.obs06.setEnabled(true);
        });

        bi.obs0797.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs07.setEnabled(false);
                bi.obs07.setText(null);
            } else
                bi.obs07.setEnabled(true);
        });

        bi.obs0897.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs08.setEnabled(false);
                bi.obs08.setText(null);
            } else
                bi.obs08.setEnabled(true);
        });

        bi.obs0997.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs09.setEnabled(false);
                bi.obs09.setText(null);
            } else
                bi.obs09.setEnabled(true);
        });

        bi.obs1097.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs10.setEnabled(false);
                bi.obs10.setText(null);
            } else
                bi.obs10.setEnabled(true);
        });

        bi.obs1197.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs11.setEnabled(false);
                bi.obs11.setText(null);
            } else
                bi.obs11.setEnabled(true);
        });

        bi.obs1297.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs12.setEnabled(false);
                bi.obs12.setText(null);
            } else
                bi.obs12.setEnabled(true);
        });

        bi.obs1397.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs13.setEnabled(false);
                bi.obs13.setText(null);
            } else
                bi.obs13.setEnabled(true);
        });

        bi.obs1497.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs14.setEnabled(false);
                bi.obs14.setText(null);
            } else
                bi.obs14.setEnabled(true);
        });

        bi.obs1597.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs15.setEnabled(false);
                bi.obs15.setText(null);
            } else
                bi.obs15.setEnabled(true);
        });

        bi.obs1697.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs16.setEnabled(false);
                bi.obs16.setText(null);
            } else
                bi.obs16.setEnabled(true);
        });

        bi.obs1797.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs17.setEnabled(false);
                bi.obs17.setText(null);
            } else
                bi.obs17.setEnabled(true);
        });

        bi.obs1897.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs18.setEnabled(false);
                bi.obs18.setText(null);
            } else
                bi.obs18.setEnabled(true);
        });

        bi.obs1997.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs19.setEnabled(false);
                bi.obs19.setText(null);
            } else
                bi.obs19.setEnabled(true);
        });

        bi.obs2097.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b) {
                bi.obs20.setEnabled(false);
                bi.obs20.setText(null);
            } else
                bi.obs20.setEnabled(true);
        });

    }


    private void setupSkips() {

    }


    private void saveDraft() {

        form.setObs01(bi.obs01.getText().toString().isEmpty() ? "-1" : bi.obs01.getText().toString());
        form.setObs0197(bi.obs0197.isChecked() ? "97" : "-1");

        form.setObs02(bi.obs02.getText().toString().isEmpty() ? "-1" : bi.obs02.getText().toString());
        form.setObs0297(bi.obs0297.isChecked() ? "97" : "-1");

        form.setObs03(bi.obs03.getText().toString().isEmpty() ? "-1" : bi.obs03.getText().toString());
        form.setObs0397(bi.obs0397.isChecked() ? "97" : "-1");

        form.setObs04(bi.obs04.getText().toString().isEmpty() ? "-1" : bi.obs04.getText().toString());
        form.setObs0497(bi.obs0497.isChecked() ? "97" : "-1");

        form.setObs05(bi.obs05.getText().toString().isEmpty() ? "-1" : bi.obs05.getText().toString());
        form.setObs0597(bi.obs0597.isChecked() ? "97" : "-1");

        form.setObs06(bi.obs06.getText().toString().isEmpty() ? "-1" : bi.obs06.getText().toString());
        form.setObs0697(bi.obs0697.isChecked() ? "97" : "-1");

        form.setObs07(bi.obs07.getText().toString().isEmpty() ? "-1" : bi.obs07.getText().toString());
        form.setObs0797(bi.obs0797.isChecked() ? "97" : "-1");

        form.setObs08(bi.obs08.getText().toString().isEmpty() ? "-1" : bi.obs08.getText().toString());
        form.setObs0897(bi.obs0897.isChecked() ? "97" : "-1");

        form.setObs09(bi.obs09.getText().toString().isEmpty() ? "-1" : bi.obs09.getText().toString());
        form.setObs0997(bi.obs0997.isChecked() ? "97" : "-1");

        form.setObs10(bi.obs10.getText().toString().isEmpty() ? "-1" : bi.obs10.getText().toString());
        form.setObs1097(bi.obs1097.isChecked() ? "97" : "-1");

        form.setObs11(bi.obs11.getText().toString().isEmpty() ? "-1" : bi.obs11.getText().toString());
        form.setObs1197(bi.obs1197.isChecked() ? "97" : "-1");

        form.setObs12(bi.obs12.getText().toString().isEmpty() ? "-1" : bi.obs12.getText().toString());
        form.setObs1297(bi.obs1297.isChecked() ? "97" : "-1");

        form.setObs13(bi.obs13.getText().toString().isEmpty() ? "-1" : bi.obs13.getText().toString());
        form.setObs1397(bi.obs1397.isChecked() ? "97" : "-1");

        form.setObs14(bi.obs14.getText().toString().isEmpty() ? "-1" : bi.obs14.getText().toString());
        form.setObs1497(bi.obs1497.isChecked() ? "97" : "-1");

        form.setObs15(bi.obs15.getText().toString().isEmpty() ? "-1" : bi.obs15.getText().toString());
        form.setObs1597(bi.obs1597.isChecked() ? "97" : "-1");

        form.setObs16(bi.obs16.getText().toString().isEmpty() ? "-1" : bi.obs16.getText().toString());
        form.setObs1697(bi.obs1697.isChecked() ? "97" : "-1");

        form.setObs17(bi.obs17.getText().toString().isEmpty() ? "-1" : bi.obs17.getText().toString());
        form.setObs1797(bi.obs1797.isChecked() ? "97" : "-1");

        form.setObs18(bi.obs18.getText().toString().isEmpty() ? "-1" : bi.obs18.getText().toString());
        form.setObs1897(bi.obs1897.isChecked() ? "97" : "-1");

        form.setObs19(bi.obs19.getText().toString().isEmpty() ? "-1" : bi.obs19.getText().toString());
        form.setObs1997(bi.obs1997.isChecked() ? "97" : "-1");

        form.setObs20(bi.obs20.getText().toString().isEmpty() ? "-1" : bi.obs20.getText().toString());
        form.setObs2097(bi.obs2097.isChecked() ? "97" : "-1");

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
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


}