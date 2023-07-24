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
        Log.d("BBB", "MainActivity: onCreate")


        btnNavigateSecondScreen = findViewById(R.id.button_navigate_second_screen)
        btnNavigateSecondScreen?.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "MainActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "MainActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "MainActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "MainActivity: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "MainActivity: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "MainActivity: onDestroy")
    }
}