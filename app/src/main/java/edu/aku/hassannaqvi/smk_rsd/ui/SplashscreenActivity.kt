package edu.aku.hassannaqvi.smk_rsd.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.aku.hassannaqvi.smk_rsd.R

import kotlinx.coroutines.*

/*
* @author Ali Azaz Alam dt. 12.16.20
* */
class SplashscreenActivity : AppCompatActivity() {
    private lateinit var activityScope: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        /*
        * Show FullScreen
        * */
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) window.insetsController?.hide(WindowInsets.Type.statusBars())
        else window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)*/
    }

    override fun onPause() {
        super.onPause()
        activityScope.cancel()
    }

    override fun onResume() {
        super.onResume()
        if (activityScope.isActive.not())
            finish()
        startActivity(Intent(this, LoginActivity::class.java).apply {})
    }

    override fun onDestroy() {
        super.onDestroy()
        activityScope.cancel()
    }

}