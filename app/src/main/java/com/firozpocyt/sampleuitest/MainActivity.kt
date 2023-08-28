package com.firozpocyt.sampleuitest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<EditText>(R.id.txt_title)
        val description = findViewById<EditText>(R.id.txt_description)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)

        btnSubmit.setOnClickListener {
            val msg = "Title - ${title.text} | Desc - ${description.text}"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("KEY", msg)
            startActivity(intent)
        }
    }
}