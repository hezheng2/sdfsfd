package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var txv:TextView= findViewById<TextView>(R.id.txv)
        txv.text = "Hello tcyang"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}