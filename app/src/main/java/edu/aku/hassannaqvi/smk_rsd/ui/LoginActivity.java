package edu.aku.hassannaqvi.smk_rsd.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.smk_rsd.MainActivity;
import edu.aku.hassannaqvi.smk_rsd.R;
import edu.aku.hassannaqvi.smk_rsd.core.MainApp;
import edu.aku.hassannaqvi.smk_rsd.database.DatabaseHelper;
import edu.aku.hassannaqvi.smk_rsd.databinding.ActivityLoginBinding;
import edu.aku.hassannaqvi.smk_rsd.models.Users;

import static edu.aku.hassannaqvi.smk_rsd.utils.AndroidUtilityKt.isNetworkConnected;
import static java.lang.Thread.sleep;


public class LoginActivity extends AppCompatActivity {


    ActivityLoginBinding bi;
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "test1234:test1234", "testS12345:testS12345", "bar@example.com:world"
    };
    DatabaseHelper db;
    private UserLoginTask mAuthTask = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_login);
        bi.setCallback(this);

        db = new DatabaseHelper(this);

        String packageName = getPackageName();
        try {
            long installedOn = this
                    .getPackageManager()
                    .getPackageInfo(packageName, 0)
                    .lastUpdateTime;
            Integer versionCode = this
                    .getPackageManager()
                    .getPackageInfo(packageName, 0)
                    .versionCode;
            String versionName = this
                    .getPackageManager()
                    .getPackageInfo(packageName, 0)
                    .versionName;
            bi.txtinstalldate.setText("Ver. " + versionName + "." + versionCode + " \r\n( Last Updated: " + new SimpleDateFormat("dd MMM. yyyy").format(new Date(installedOn)) + " )");

            MainApp.versionCode = versionCode;
            MainApp.versionName = versionName;


        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }


    }

    public void attemptLogin(View view) {
        if (mAuthTask != null) {
            return;
        }
        bi.username.setError(null);
        bi.password.setError(null);
        String email = bi.username.getText().toString();
        String password = bi.password.getText().toString();
        boolean cancel = false;
        View focusView = null;

        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            bi.password.setError(getString(R.string.error_invalid_password));
            focusView = bi.password;
            cancel = true;
        }
        if (TextUtils.isEmpty(email)) {
            bi.username.setError(getString(R.string.error_field_required));
            focusView = bi.username;
            cancel = true;
        }

        if (cancel) {
            focusView.requestFocus();
        } else {
            //    showProgress(true);
            mAuthTask = new UserLoginTask(email, password);
            mAuthTask.execute((Void) null);
        }
    }


    public void onSyncDataClick(View view) {
        if (!isNetworkConnected(this)) {
            Toast.makeText(this, "Network connection not available!", Toast.LENGTH_SHORT).show();
            return;
        }
        startActivity(new Intent(this, SyncActivity.class));
    }

/*    public void syncData() {
//        ConnectivityManager connMgr = (ConnectivityManager)
//                getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
//        if (networkInfo != null && networkInfo.isConnected()) {
//            new GetAllData(this, "users", MainApp._HOST_URL + UsersContract.UsersTable._URI).execute();
////            new GetAllData(this, "ucs", MainApp._HOST_URL + UCsContract.UCsTable._URI).execute();
//            new GetAllData(this, "villages", MainApp._HOST_URL + VillagesContract.singleVillage._URI).execute();
//        } else {
//            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
//        }

        startActivity(new Intent(this, SyncActivity.class));
    }*/

/*    private void showProgress(boolean b) {
        if (b) {
            bi.loginBtn.setVisibility(View.GONE);
            bi.progressBar.setVisibility(View.VISIBLE);
        } else {
            bi.loginBtn.setVisibility(View.VISIBLE);
            bi.progressBar.setVisibility(View.GONE);
        }
    }*/



    public class UserLoginTask extends AsyncTask<Void, Void, Boolean> {

        private final String mEmail;
        private final String mPassword;

        UserLoginTask(String email, String password) {
            mEmail = email;
            mPassword = password;
        }


        @Override
        protected Boolean doInBackground(Void... params) {
            try {
                // Simulate network access.
                sleep(2000);
            } catch (InterruptedException e) {
                return false;
            }
            for (String credential : DUMMY_CREDENTIALS) {
                String[] pieces = credential.split(":");
                if (pieces[0].equals(mEmail)) {
                    // Account exists, return true if the password matches.
                    return pieces[1].equals(mPassword);
                }
            }
            return true;
        }

        @Override
        protected void onPostExecute(final Boolean success) {
            mAuthTask = null;
            /*LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            if (mlocManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
                    || (tagValues.get("org") == null || tagValues.get("org").equals("5"))) {*/
            db = MainApp.appInfo.dbHelper;
            MainApp.user = db.getLoginUser(mEmail, mPassword);

            if ((mEmail.equals("dmu@aku") && mPassword.equals("aku?dmu")) ||
                    (mEmail.equals("guest@aku") && mPassword.equals("aku1234"))
                    || (mEmail.equals("test1234") && mPassword.equals("test1234")) || MainApp.user != null) {

                if (MainApp.user == null) {
                    MainApp.user = new Users(mEmail, MainApp.DIST_ID);
                }

                MainApp.admin = mEmail.contains("@");
                Intent iLogin = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(iLogin);
            } else {
                bi.password.setError(getString(R.string.error_incorrect_password));
                bi.password.requestFocus();
                Toast.makeText(LoginActivity.this, mEmail + " " + mPassword, Toast.LENGTH_SHORT).show();
            }

            /*          } else {
                showProgress(false);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        edu.aku.hassannaqvi.smk_rsd.ui.LoginActivity.this);
                alertDialogBuilder
                        .setMessage("GPS is disabled in your device. Enable it?")
                        .setCancelable(false)
                        .setPositiveButton("Enable GPS",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        Intent callGPSSettingIntent = new Intent(
                                                android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                                        startActivity(callGPSSettingIntent);
                                    }
                                });
                alertDialogBuilder.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = alertDialogBuilder.create();
                alert.show();
            }*/
        }
    }

    public void onShowPasswordClick(View view) {
        //TODO implement
        if (bi.password.getTransformationMethod() == null) {
            bi.password.setTransformationMethod(new PasswordTransformationMethod());
            bi.password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_close, 0, 0, 0);
        } else {
            bi.password.setTransformationMethod(null);
            bi.password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_lock_open, 0, 0, 0);
        }
    }


    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() >= 7;
    }


}
