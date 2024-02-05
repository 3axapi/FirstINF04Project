package com.example.nextproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.ToggleButton
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    private lateinit var myTextView: TextView
    private lateinit var myName: EditText
    private lateinit var myEmail: EditText
    private lateinit var myPhone: EditText
    private lateinit var myCheck1: CheckBox
    private lateinit var myCheck2: CheckBox
    private lateinit var mySpinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myCheck1 = findViewById(R.id.checkbox_1)
        myCheck2 = findViewById(R.id.checkbox_2)

        val radioGroup: RadioGroup = findViewById(R.id.group_pizza)
        radioGroup.setOnCheckedChangeListener { group, checkId ->
            val myTextView = findViewById<TextView>(R.id.textview_testowy)
            when(checkId) {
                R.id.radio_szynka -> myTextView.text = "będzie mięso"
                R.id.radio_wege -> myTextView.text = "nie będzie mięsa"
                R.id.radio_ryba -> myTextView.text = "może być mięso"
            }
        }

        mySpinner = findViewById(R.id.my_spinner)
        mySpinner.onItemSelectedListener = object : AdapterView.onItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val myTextView = findViewById<TextView>(R.id.textview_testowy)
                val selectedItem: String = mySpinner.selectedItem.toString()
                myTextView.text = selectedItem
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not yest")
            }
        }
    }

    fun slijDane(view: View) {
        myTextView = findViewById(R.id.textview_testowy)
        myName = findViewById(R.id.edittext_name)
        myEmail = findViewById(R.id.edittext_email)
        myPhone = findViewById(R.id.edittext_phone)

        Log.i("mytag", "${myName.text}, ${myEmail.text}, ${myPhone.text}")
    }

    fun toggleClick(view: View) {
        val on = (view as ToggleButton).isChecked
        if (on) Log.i("toggle", "wciśnięty")
        else Log.i("toggle", "niewciśnięty")
    }

    fun switchClick(view: View) {
        val on = (view as SwitchMaterial).isChecked
        if (on) Log.i("switch", "switchnięty")
        else Log.i("switch", "nieswitchnięty")
    }

    fun checKClick(view: View) {
        val isChecked: Boolean = (view as? CheckBox)?.isChecked ?: false // if obj = null → false || else obj = true

        when(view.id) {
            R.id.checkbox_1 ->
                if (isChecked) myTextView.text = "Jesteś Ufoludkiem"
                else myTextView.text = ""
            R.id.checkbox_2 ->
                if (isChecked) myTextView.text = "Jesteś Ziemianiem"
                else myTextView.text = ""
        }
    }
}