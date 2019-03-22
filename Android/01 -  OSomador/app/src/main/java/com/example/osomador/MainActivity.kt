package com.example.osomador

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etNum1: EditText
    private lateinit var etNum2: EditText
    private lateinit var btSomar: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etNum1 = findViewById(R.id.etNumero1)
        this.etNum2 = findViewById(R.id.etNumero2)
        this.btSomar = findViewById(R.id.btSomar)
        this.tvResultado = findViewById(R.id.tvResultado)
    }

    fun somar(view:View){
        var n1 = this.etNum1.text.toString().toInt()
        var n2 = this.etNum2.text.toString().toInt()
        var soma = n1 + n2
        this.tvResultado.text = soma.toString()
    }
}
