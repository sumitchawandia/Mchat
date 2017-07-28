package com.example.android.mchat

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var knowMore = findViewById(R.id.knowMore) as TextView
        knowMore.setOnClickListener {
            startActivity(Intent(this, MainDetailActivity::class.java))
        }
        var takeTheTest = findViewById(R.id.bt_take_the_test) as TextView
        takeTheTest.setOnClickListener {
            startActivity(Intent(this, ChildInfoActivity::class.java))
        }
    }
}
