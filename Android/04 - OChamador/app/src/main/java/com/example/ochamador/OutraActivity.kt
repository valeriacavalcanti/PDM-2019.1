package com.example.ochamador

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class OutraActivity : AppCompatActivity() {
    private lateinit var btOk: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outra)

        Log.e("APP_OCHAMADOR", "Outra: onCreate")

        this.btOk = findViewById(R.id.btOutraOK)
        this.btOk.setOnClickListener({ voltaMain(it) })

        Log.e("APP_OCHAMADOR", intent.getStringExtra("MSG_IDA"))
    }

    fun voltaMain(view: View){
        var intent = Intent()
        intent.putExtra("MSG_VOLTA", "Que bom! Voltou!")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    override fun onStart() {
        super.onStart()

        Log.e("APP_OCHAMADOR", "Outra: onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.e("APP_OCHAMADOR", "Outra: onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.e("APP_OCHAMADOR", "Outra: onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.e("APP_OCHAMADOR", "Outra: onStop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.e("APP_OCHAMADOR", "Outra: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e("APP_OCHAMADOR", "Outra: onDestroy")
    }
}
