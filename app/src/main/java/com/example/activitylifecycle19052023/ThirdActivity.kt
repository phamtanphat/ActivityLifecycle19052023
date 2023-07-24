package com.example.activitylifecycle19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Log.d("BBB", "ThirdActivity: onCreate")
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