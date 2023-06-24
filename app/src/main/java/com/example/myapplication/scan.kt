package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class scan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)
    }
    fun brandsFromScan(view: View) {
        val randomIntent = Intent(this, brands_choice::class.java);
        startActivity(randomIntent);
    }
}