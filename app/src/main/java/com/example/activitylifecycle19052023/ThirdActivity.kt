package com.example.activitylifecycle19052023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ThirdActivity : AppCompatActivity() {

    private var btnNavigateMainScreen: Button? = null
    private var btnNavigateThirdScreen: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Log.d("BBB", "ThirdActivity: onCreate")

        btnNavigateMainScreen = findViewById(R.id.button_navigate_main_screen)
        btnNavigateThirdScreen = findViewById(R.id.button_navigate_third_screen)

        btnNavigateMainScreen?.setOnClickListener {
            val intent = Intent(this@ThirdActivity, MainActivity::class.java)
            startActivity(intent)
        }

        btnNavigateThirdScreen?.setOnClickListener {
            val intent = Intent(this@ThirdActivity, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "ThirdActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "ThirdActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "ThirdActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "ThirdActivity: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "ThirdActivity: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "ThirdActivity: onDestroy")
    }
}