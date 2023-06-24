package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class brands_choice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brands_choice)
    }
    fun camFromBrands(view: View) {
        val randomIntent = Intent(this, cam::class.java);
        startActivity(randomIntent);
    }
    fun startFromBrands(view: View) {
        val randomIntent = Intent(this, MainActivity::class.java);
        startActivity(randomIntent);
    }
}