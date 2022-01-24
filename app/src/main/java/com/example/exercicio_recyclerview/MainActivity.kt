package com.example.exercicio_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.layoutManager = LinearLayoutManager(this)

        val contatosOK = adcionarContatos()

        val adapterOk = Adapter(contatosOK as MutableList<Contatos>)

        recycler.adapter =adapterOk

    }
        private fun adcionarContatos():List<Contatos>{

            val listaDeContatos = mutableListOf<Contatos>()

            listaDeContatos.add(Contatos("Batman", "E ae man, beleza?", R.drawable.batman))
            listaDeContatos.add(Contatos("Coringa", "Bora?", R.drawable.coriga))
            listaDeContatos.add(Contatos("Mulher Maravilha", "Tudo bem então", R.drawable.mulher_maravilha))
            listaDeContatos.add(Contatos("Flash", "Fechou", R.drawable.flash))
            listaDeContatos.add(Contatos("Super Homem", "Isso mesmo", R.drawable.superman))
            listaDeContatos.add(Contatos("Liga da Justiça", "Reunião amanhã", R.drawable.liga_justica))
            listaDeContatos.add(Contatos("Aquaman", "Beleza", R.drawable.aquaman))
            listaDeContatos.add(Contatos("Mulher Gavião", "Ok", R.drawable.mulher_gaviao))
            listaDeContatos.add(Contatos("Lanterna Verde", "Show", R.drawable.lanterna_verde))
            listaDeContatos.add(Contatos("Homem de Ferro", "Combinado", R.drawable.homem_ferro))
            listaDeContatos.add(Contatos("Hulk", "Que horas é a reunião mesmo? kkk", R.drawable.hulk))
            listaDeContatos.add(Contatos("Cyborg", "E ae man, beleza?", R.drawable.cyborg))

            return listaDeContatos

        }


}