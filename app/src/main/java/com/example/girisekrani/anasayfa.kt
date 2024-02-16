package com.example.girisekrani

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
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

        //post beğenme
        val postbegen = findViewById<ImageButton>(R.id.postbegen)
        postbegen.setOnClickListener{
            Toast.makeText(this@anasayfa, "POSTU BEĞENDİN", Toast.LENGTH_LONG).show()
        }

        //post yorum
        val postyorum = findViewById<ImageButton>(R.id.postyorum)
        postyorum.setOnClickListener{
            Toast.makeText(this@anasayfa, "POST YORUMA KAPALI", Toast.LENGTH_LONG).show()
        }
        //post mesaj
        val postmesaj = findViewById<ImageButton>(R.id.postmesaj)
        postmesaj.setOnClickListener{
            Toast.makeText(this@anasayfa, "BU POST PAYLAŞILAMAZ", Toast.LENGTH_LONG).show()
        }

        //post kaydet
        val postkaydet = findViewById<ImageButton>(R.id.postkaydet)
        postkaydet.setOnClickListener{
            Toast.makeText(this@anasayfa, "POST KAYDEDİLDİ", Toast.LENGTH_LONG).show()
        }

        //ali story
        val zuckpost = findViewById<ImageButton>(R.id.zuckpost)
        zuckpost.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val clickTime = System.currentTimeMillis()

                if (clickTime - lastClickTime < doubleClickInterval) {
                    // İki kez tıklandıysa
                    Toast.makeText(this@anasayfa, "POSTU BEĞENDİN", Toast.LENGTH_LONG).show()
                }

                lastClickTime = clickTime
            }
        })



    }
}