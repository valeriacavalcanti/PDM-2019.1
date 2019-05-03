package com.example.osalvador

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var dao: PessoaDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dao = PessoaDAO(this)

        dao.insert(Pessoa("Terceira", 3))
        dao.insert(Pessoa("Quarta", 4))

        Log.i("APP_PESSOA", dao.get().toString())
    }
}
