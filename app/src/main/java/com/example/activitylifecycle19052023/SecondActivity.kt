package com.example.activitylifecycle19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("BBB", "SecondActivity: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "SecondActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "SecondActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "SecondActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "SecondActivity: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "SecondActivity: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "SecondActivity: onDestroy")
    }
}