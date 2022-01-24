package com.example.exercicio_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter (val contatoLista: MutableList<Contatos>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detlhe, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int =contatoLista.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val name = holder.nome
        name.text = contatoLista[position].nome

        val description = holder.descricao
        description.text = contatoLista[position].descricao

        val image = holder.imagemPessoa
        image.setImageResource(contatoLista[position].imagem)


    }


}