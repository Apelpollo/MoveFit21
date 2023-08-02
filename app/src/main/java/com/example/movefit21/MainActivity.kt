package com.example.movefit21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.content.Intent
import android.widget.Toast
import android.widget.EditText
import android.annotation.SuppressLint




class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn: Button = findViewById(R.id.btnsign1)
        btn.setOnClickListener{
            val intent = Intent(this, menu::class.java)
            startActivity(intent)
        }

        val btnn: Button = findViewById(R.id.links)
        btnn.setOnClickListener{
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
            }
        }



