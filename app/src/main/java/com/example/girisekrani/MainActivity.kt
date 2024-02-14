package com.example.girisekrani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.File
import java.lang.Exception
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.giris)

        val edittextler1 = listOf<EditText>(
            findViewById(R.id.kullanici),
            findViewById(R.id.sifre)
        )

        for (edittext1 in edittextler1){
            edittext1.setOnFocusChangeListener { _, hasFocus ->
                if (hasFocus && edittext1.text.toString() == edittext1.text.toString()) {
                    edittext1.text.clear()
                } else if (!hasFocus && edittext1.text.isBlank()) {
                    edittext1.setText(edittext1.text.toString())
                }
            }

        }

        //facebook butonu
        val facebook = findViewById<Button>(R.id.facebook)
        facebook.setOnClickListener{
            val intent1 = Intent(this, facebookgiris::class.java)
            startActivity(intent1)
        }

        //giris butonu
        val giris = findViewById<Button>(R.id.giris)
        giris.setOnClickListener {
            var buyuk = 0
            var kucuk = 0
            var sayi = 0
            val sifre = findViewById<EditText>(R.id.sifre)
            for (harf in sifre.text) {
                if (harf.isUpperCase()) buyuk++
                else if (harf.isLowerCase()) kucuk++
                else if (harf.isDigit()) sayi++
            }
            if (buyuk > 0 && kucuk > 0 && sayi > 0){
                val intent2 = Intent(this, anasayfa::class.java)
                startActivity(intent2)
            }
            else
                Toast.makeText(this@MainActivity, "HATALI ŞİFRE", Toast.LENGTH_LONG).show()
        }

        //sifremi unuttum butonu
        val unut = findViewById<Button>(R.id.unut)
        unut.setOnClickListener{
            val intent3 = Intent(this, sifreunuttum::class.java)
            startActivity(intent3)
        }

        //kayit ol butonu
        val kayıt = findViewById<Button>(R.id.kayıt)
        kayıt.setOnClickListener{
            val intent4 = Intent(this, kayitol::class.java)
            startActivity(intent4)
        }







    }


}