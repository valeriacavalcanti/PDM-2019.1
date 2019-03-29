package com.example.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var etUsuario: EditText
    private lateinit var etSenha: EditText
    private lateinit var btOk: Button
    private lateinit var btCancelar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etUsuario = findViewById(R.id.etUsuario)
        this.etSenha = findViewById(R.id.etSenha)
        this.btOk = findViewById(R.id.btOk)
        this.btCancelar = findViewById(R.id.btCancelar)

        this.btOk.setOnClickListener({ salvar(it) })

        this.btCancelar.setOnClickListener({
            Log.e("APP_LOGIN","Clicou Cancelar!")
        })
    }

    // OnClick: btOk
    fun salvar(view: View){
        Log.i("APP_LOGIN", "Clicou Ok !")
    }
}
