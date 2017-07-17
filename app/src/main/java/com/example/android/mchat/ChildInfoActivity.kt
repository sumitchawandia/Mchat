package com.example.android.mchat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.TextView

/**
 * Created by sumit on 7/17/2017.
 */
class ChildInfoActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.child_info)

            var close_button = findViewById(R.id.close_Button) as ImageButton
            close_button.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
}