package com.example.girisekrani

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ListView
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView

class anasayfa : AppCompatActivity() {
    private var lastClickTime: Long = 0
    private val doubleClickInterval: Long = 1000

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anasayfa)

        //dm butonu
        val dm = findViewById<ImageButton>(R.id.dm)
        dm.setOnClickListener{
            Toast.makeText(this@anasayfa, "ÜZGÜNÜM MESAJIN HİÇ YOK", Toast.LENGTH_LONG).show()
        }

        //bildirim butonu
        val bildirim = findViewById<ImageButton>(R.id.bildirimler)
        bildirim.setOnClickListener{
            Toast.makeText(this@anasayfa, "ÜZGÜNÜM BİLDİRİMİN HİÇ YOK", Toast.LENGTH_LONG).show()
        }




        val postlar = ArrayList<postclass>()
        postlar.add(postclass(R.drawable.ppzuck,"Zuck", R.drawable.zuckpost, "Zuck", "Good to be back home with this nugget." ))
        postlar.add(postclass(R.drawable.ppelon,"Elon", R.drawable.elonpost, "Elon", "Felt cute, might delete later." ))
        postlar.add(postclass(R.drawable.pppinar,"Pınar", R.drawable.pinarpost, "Pinar", "Good day:)" ))
        postlar.add(postclass(R.drawable.ppinsta,"Instagram", R.drawable.instapost, "Instagram", "I grew up with and still collect." ))


        val adapter = adapter(this, postlar)
        val listview = findViewById<ListView>(R.id.list)
        listview.adapter = adapter
    }
}