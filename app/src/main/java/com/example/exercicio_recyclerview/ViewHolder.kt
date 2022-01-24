package com.example.exercicio_recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val nome by lazy { view.findViewById<TextView>(R.id.tv_nome) }
    val descricao by lazy { view.findViewById<TextView>(R.id.tv_mobile) }
    val cardView by lazy { view.findViewById<CardView>(R.id.card_view) }
    val imagemPessoa by lazy { view.findViewById<ImageView>(R.id.circleImageView) }

}