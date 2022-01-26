package com.example.bruh6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ctv = findViewById<CheckedTextView>(R.id.checkedTextView)
        ctv.isChecked=false
        ctv.setCheckMarkDrawable(
            android.R.drawable.checkbox_off_background)
        val ctv2 = findViewById<CheckedTextView>(R.id.checkedTextView2)
        ctv2.isChecked=false
        ctv2.setCheckMarkDrawable(
            android.R.drawable.checkbox_off_background)

        ctv.setOnClickListener{
            ctv.isChecked = !ctv.isChecked
            ctv.setCheckMarkDrawable(
                if(ctv.isChecked)
                    android.R.drawable.checkbox_on_background
                else
                    android.R.drawable.checkbox_off_background
            )
            val msg = getString(R.string.pre_msg) + " " + getString(if (ctv.isChecked) R.string.checked1 else R.string.unchecked1) + "," + getString(if (ctv.isChecked) R.string.checked2 else R.string.unchecked2)
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }
        ctv2.setOnClickListener{
            ctv2.isChecked = !ctv2.isChecked
            ctv2.setCheckMarkDrawable(
                if(ctv2.isChecked)
                    android.R.drawable.checkbox_on_background
                else
                    android.R.drawable.checkbox_off_background
            )
            val msg = getString(R.string.pre_msg) + " " + getString(if (ctv.isChecked) R.string.checked1 else R.string.unchecked1) + "," + getString(if (ctv.isChecked) R.string.checked2 else R.string.unchecked2)
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }
    }
}