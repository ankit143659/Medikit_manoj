package com.example.minorproject_resumebuilder

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MedicalForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_medical_form)


            val medical: Button = findViewById(R.id.medical)

            medical.setOnClickListener {

                val manoj = Intent(this, Medical_search::class.java)
                startActivity(manoj)
            }

        }

    }
