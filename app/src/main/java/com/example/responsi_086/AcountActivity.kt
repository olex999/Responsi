package com.example.responsi_086

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acount.*

class AcountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acount)

        val bundle = intent.extras
        val nama = bundle?.get("nama")
        val nim = bundle?.get("nim")
        val email = bundle?.get("email")

        tw_nama.text =("Nama: "+ (nama))
        tw_nim.text = ("NIM: "+ (nim))
        tw_email.text = ("Email: "+ (email))


    }
}
