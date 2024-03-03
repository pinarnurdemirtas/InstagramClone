package com.example.girisekrani

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class facebookgiris : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebookgiris)

        val edittextler2 = listOf<EditText>(
            findViewById(R.id.fkullanici),
            findViewById(R.id.fsifre)
        )



        //giriş yap butonu
        val fgiris = findViewById<Button>(R.id.fgiris)
        fgiris.setOnClickListener{
            Toast.makeText(this@facebookgiris, "FACEBOOK GİRİŞ YAPILDI", Toast.LENGTH_LONG).show()
        }

        //şifremi unuttum butonu
        val funut = findViewById<Button>(R.id.funut)
        funut.setOnClickListener{
            val intent5 = Intent(this, sifreunuttum::class.java)
            startActivity(intent5)
        }

        //yeni hesap butonu
        val fkayit = findViewById<Button>(R.id.fkayit)
        fkayit.setOnClickListener{
            Toast.makeText(this@facebookgiris, "KAYIT YAPILDI", Toast.LENGTH_LONG).show()
        }



    }
}