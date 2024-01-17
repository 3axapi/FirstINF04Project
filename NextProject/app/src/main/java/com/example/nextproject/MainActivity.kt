package com.example.nextproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var myTextView: TextView
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var phoneEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textview_testowy)

        Log.i("mytag", "${nameEditText.text}, ${emailEditText.text}, ${phoneEditText.text}")

        nameEditText = findViewById(R.id.edittext_name)
        emailEditText = findViewById(R.id.edittext_email)
        phoneEditText = findViewById(R.id.edittext_phone)
    }
}