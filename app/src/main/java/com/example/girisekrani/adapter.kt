package com.example.girisekrani

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class adapter(context: Context, liste:ArrayList<postclass>): BaseAdapter(){
    val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    val liste = liste
    override fun getCount(): Int {
        return liste.size
    }

    override fun getItem(position: Int): Any {
        return liste.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = inflater.inflate(R.layout.post, parent, false)
        val pp = view.findViewById<ImageView>(R.id.pp)
        val ad = view.findViewById<TextView>(R.id.ad)
        val post = view.findViewById<ImageView>(R.id.post)
        val isim = view.findViewById<TextView>(R.id.isim)
        val aciklama = view.findViewById<TextView>(R.id.aciklama)

        pp.setImageResource(liste.get(position).profil)
        ad.text = liste.get(position).ad
        post.setImageResource(liste.get(position).post)
        isim.text = liste.get(position).isim
        aciklama.text = liste.get(position).aciklama

        return view

    }
}