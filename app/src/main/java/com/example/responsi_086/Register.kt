package com.example.responsi_086

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama = findViewById<EditText>(R.id.rg_nama)
        val nim = findViewById<EditText>(R.id.rg_nim)
        val email = findViewById<EditText>(R.id.rg_email)


        btn_register.setOnClickListener(){
            val Nama = nama.text.toString()
            val Nim = nim.text.toString()
            val Email = email.text.toString()

            val intent = Intent(this, AcountActivity::class.java)
            intent.putExtra("nama", Nama)
            intent.putExtra("nim", Nim)
            intent.putExtra("email", Email)
            startActivity(intent)
        }
    }
}
