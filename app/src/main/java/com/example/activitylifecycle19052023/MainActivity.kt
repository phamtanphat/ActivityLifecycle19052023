package com.example.activitylifecycle19052023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var btnNavigateSecondScreen: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("BBB", "onCreate")


        btnNavigateSecondScreen = findViewById(R.id.button_navigate_second_screen)
        btnNavigateSecondScreen?.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
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