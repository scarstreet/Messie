package com.example.messie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// THIS IS AN ACTIVITY

class Task : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)
    }
}