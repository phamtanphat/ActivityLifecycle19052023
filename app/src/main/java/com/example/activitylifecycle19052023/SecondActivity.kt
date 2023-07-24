package com.example.activitylifecycle19052023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    private var btnNavigateThirdScreen: Button? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("BBB", "SecondActivity: onCreate")

        btnNavigateThirdScreen = findViewById(R.id.button_navigate_third_screen)
        btnNavigateThirdScreen?.setOnClickListener {
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intent)
        }
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