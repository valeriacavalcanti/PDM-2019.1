package com.example.ochamadormaster

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btHtml: Button
    private lateinit var btDiscar: Button
    private lateinit var btLigar: Button
    private lateinit var btEmail: Button
    private lateinit var btSMS: Button
    private lateinit var btCompartilharTexto: Button
    private lateinit var btPonto: Button
    private lateinit var btRota: Button
    private lateinit var btYoutube: Button
    private lateinit var btFoto: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btHtml = findViewById(R.id.btHtml)
        this.btDiscar = findViewById(R.id.btDiscar)
        this.btLigar = findViewById(R.id.btLigar)
        this.btEmail = findViewById(R.id.btEmail)
        this.btSMS = findViewById(R.id.btSMS)
        this.btCompartilharTexto = findViewById(R.id.btCompartilharTexto)
        this.btPonto = findViewById(R.id.btPonto)
        this.btRota = findViewById(R.id.btRota)
        this.btYoutube = findViewById(R.id.btYoutube)
        this.btFoto = findViewById(R.id.btFoto)


        this.btHtml.setOnClickListener({ html(it) })
        this.btDiscar.setOnClickListener({ discar(it) })
        this.btLigar.setOnClickListener({ ligar(it) })
        this.btEmail.setOnClickListener({ email(it) })
        this.btSMS.setOnClickListener({ sms(it) })
        this.btCompartilharTexto.setOnClickListener({ compartilharTexto(it) })
        this.btPonto.setOnClickListener({ ponto(it) })
        this.btRota.setOnClickListener({ rota(it) })
        this.btYoutube.setOnClickListener({ youtube(it) })
        this.btFoto.setOnClickListener({ foto(it) })
    }

    fun html(view: View){
        val uri = Uri.parse("http://pdm.valeriacavalcanti.com.br")
        val it = Intent(Intent.ACTION_VIEW, uri)
        startActivity(it)
    }

    fun discar(view: View){

    }

    fun ligar(view: View){

    }

    fun email(view: View){

    }

    fun sms(view: View){

    }

    fun compartilharTexto(view: View){

    }

    fun ponto(view: View){

    }

    fun rota(view: View){

    }

    fun youtube(view: View){

    }

    fun foto(view: View){

    }
}
