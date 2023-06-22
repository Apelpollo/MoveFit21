package com.example.movefit21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.content.Intent



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn: Button = findViewById(R.id.btnsign1)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }


}