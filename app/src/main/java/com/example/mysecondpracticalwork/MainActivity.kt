package com.example.mysecondpracticalwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showActivitySecond(view: View) {
        val SecondActivity = Intent(this, second_Activity2::class.java)
        startActivity(SecondActivity)
    }
}