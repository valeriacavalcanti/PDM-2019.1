package com.example.ologador

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etLogin: EditText
    private lateinit var etSenha: EditText
    private lateinit var btOk: Button
    private lateinit var btCancelar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etLogin = findViewById(R.id.etLogin)
        this.etSenha = findViewById(R.id.etSenha)
        this.btOk = findViewById(R.id.btOk)
        this.btCancelar = findViewById(R.id.btCancelar)

        this.btOk.setOnClickListener({ salvar(it) })
        this.btCancelar.setOnClickListener({ cancelar(it) })
    }

    public fun salvar(view: View){
        val login = this.etLogin.text.toString()
        val senha = this.etSenha.text.toString()

        if (login.equals("ADMIN", true) && senha.equals("123456")){
            val it = Intent()
            it.putExtra("LOGIN", login)
            setResult(Activity.RESULT_OK, it)
            finish()
        }else{
            Toast.makeText(this, "Login e/ou senha inválido(s)", Toast.LENGTH_SHORT).show()
        }
    }

    public fun cancelar(view: View){
        finish()
    }
}
