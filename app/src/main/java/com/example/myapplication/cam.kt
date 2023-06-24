package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cam)
    }
    fun scanFromCam(view: View) {
        val randomIntent = Intent(this, scan::class.java);
        startActivity(randomIntent);
    }
    fun brandsFromCam(view: View) {
        val randomIntent = Intent(this, brands_choice::class.java);
        startActivity(randomIntent);
    }
}