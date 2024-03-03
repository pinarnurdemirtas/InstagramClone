package com.example.girisekrani

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.giris)

        val edittextler1 = listOf<EditText>(
            findViewById(R.id.kullanici),
            findViewById(R.id.sifre)
        )



        //facebook butonu
        val facebook = findViewById<Button>(R.id.facebook)
        facebook.setOnClickListener{
            val intent1 = Intent(this, facebookgiris::class.java)
            startActivity(intent1)
        }

        //giris butonu
        val giris1 = findViewById<Button>(R.id.giris1)
        giris1.setOnClickListener {
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
                Toast.makeText(this@MainActivity, "Büyük harf, küçük harf ve sayı içermeli !", Toast.LENGTH_LONG).show()
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