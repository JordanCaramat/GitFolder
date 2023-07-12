package com.example.krugerchug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       val StaetProgramButton = findViewById<Button>(R.id.start_btn)
        StaetProgramButton.setOnClickListener {
            val Intent = Intent(this, StaetProgram::class.java)
            startActivity(Intent)
        }
        }
    }
