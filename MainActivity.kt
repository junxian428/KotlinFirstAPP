package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_click_me = findViewById(R.id.button) as Button
        var myTextView = findViewById(R.id.textView) as TextView
        var timeclick = 0
        btn_click_me.setOnClickListener{
            timeclick += 1
            myTextView.text = timeclick.toString()
            Toast.makeText(this@MainActivity,"Sohai Idiot You Click Me!!!", Toast.LENGTH_SHORT).show()
        }


    }
}