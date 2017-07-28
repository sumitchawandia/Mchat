package com.example.android.mchat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageButton

/**
 * Created by sumit on 7/17/2017.
 */
class ChildInfoActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_child_info)

            var close_button = findViewById(R.id.bt_close) as ImageButton
            close_button.setOnClickListener {
                val a = Intent(this, MainActivity::class.java)
                a.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(a)
            }
        }
}