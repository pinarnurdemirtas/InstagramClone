package com.example.girisekrani

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class sifreunuttum : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sifreunuttum)

        val epostaunut = findViewById<EditText>(R.id.epostaunut)
        epostaunut.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus && epostaunut.text.toString() == epostaunut.text.toString()) {
                epostaunut.text.clear()
            } else if (!hasFocus && epostaunut.text.isBlank()) {
                epostaunut.setText(epostaunut.text.toString())
            }
        }

        //gönder butonu
        val gonder = findViewById<Button>(R.id.gonder)
        gonder.setOnClickListener{
            Toast.makeText(this@sifreunuttum, "KOD GÖNDERİLDİ", Toast.LENGTH_LONG).show()

        }

        //yeni hesap butonu
        val yenihes = findViewById<Button>(R.id.yenihes)
        yenihes.setOnClickListener{
            Toast.makeText(this@sifreunuttum, "YENİ HESAP OLUŞTURULDU!", Toast.LENGTH_LONG).show()
        }

    }
}