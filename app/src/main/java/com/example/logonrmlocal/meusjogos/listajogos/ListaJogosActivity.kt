package com.example.logonrmlocal.meusjogos.listajogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.logonrmlocal.meusjogos.R
import com.example.logonrmlocal.meusjogos.detalhejogo.DetalheActivity
import com.example.logonrmlocal.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)


        rvJogos.adapter = JogosAdapter(this, getJogos(), {jogo ->
            val detalheIntent = Intent(this, DetalheActivity::class.java)
            detalheIntent.putExtra("JOGO", jogo)
            startActivity(detalheIntent)
        })

        rvJogos.layoutManager = LinearLayoutManager(this)
    }

    private fun getJogos(): List<Jogo> {
        return listOf(
                Jogo(R.drawable.spiderman, "Spiderman", 2018, "legal"),
                Jogo(R.drawable.civ_v, "Civilization V", 2010, "legal"),
                Jogo(R.drawable.last_of_us, "The Last of Us", 2013, "legal"),
                Jogo(R.drawable.dark_souls, "Dark Souls", 2011, "legal"),
                Jogo(R.drawable.bioshock_infinite, "Bioshock Infinite", 2013, "legal"),
                Jogo(R.drawable.full_throttle, "Full Throttle", 1995, "legal"),
                Jogo(R.drawable.xcom, "XCOM: Enemy Unknow", 2012, "legal")

        )

    }
}
