package com.example.girisekrani

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class kayitol : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayitol)

        //facebook giriş butonu
        val facegiris = findViewById<Button>(R.id.facegiris)
        facegiris.setOnClickListener{
            val intentt = Intent(this, facebookgiris::class.java)
            startActivity(intentt)
        }

        val edittextler = listOf<EditText>(
            findViewById(R.id.eposta),
            findViewById(R.id.adsoyad),
            findViewById(R.id.kullaniciadi),
            findViewById(R.id.sifree)
        )

        for (edittext in edittextler){
            edittext.setOnFocusChangeListener { _, hasFocus ->
                if (hasFocus && edittext.text.toString() == edittext.text.toString()) {
                    edittext.text.clear()
                } else if (!hasFocus && edittext.text.isBlank()) {
                    edittext.setText(edittext.text.toString())
                }
            }

        }

        //kayıt ol butonu
        val instakayit = findViewById<Button>(R.id.instakayit)
        instakayit.setOnClickListener{
                Toast.makeText(this@kayitol, "KAYIT YAPILDI!", Toast.LENGTH_LONG).show()
        }



    }
}