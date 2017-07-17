package com.example.android.mchat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by sumit on 6/14/2017.
 */

class MainDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.introduction_detail_activity)

        var takeTheTest = findViewById(R.id.takeTheTest) as TextView
        takeTheTest.setOnClickListener {
            startActivity(Intent(this, ChildInfoActivity::class.java))
        }
    }
}
