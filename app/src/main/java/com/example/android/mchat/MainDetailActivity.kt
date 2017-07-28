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
        setContentView(R.layout.activity_introduction_detail)

        var takeTheTest = findViewById(R.id.bt_take_the_test) as TextView
        takeTheTest.setOnClickListener {
            val a = Intent(this, ChildInfoActivity::class.java)
            startActivity(a)
        }
    }
}
