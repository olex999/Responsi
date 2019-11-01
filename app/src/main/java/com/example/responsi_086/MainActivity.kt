package com.example.responsi_086

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.lg_username)
        val password = findViewById<EditText>(R.id.lg_password)

        bt_login.setOnClickListener(){
            if (username.text.toString() == "fakhri" && password.text.toString() == "fakhri123"){
                intent = Intent(this, HomeActivity:: class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Username dan Password Anda Salah", Toast.LENGTH_LONG).show()
            }
        }

        bt_register.setOnClickListener(){
            intent = Intent(this, Register:: class.java)
            startActivity(intent)
        }
    }
}
