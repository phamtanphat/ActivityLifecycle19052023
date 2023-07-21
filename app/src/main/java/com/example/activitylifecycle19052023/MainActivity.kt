package com.example.activitylifecycle19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("BBB", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "onDestroy")
    }
}