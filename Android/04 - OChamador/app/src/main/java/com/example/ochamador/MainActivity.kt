package com.example.ochamador

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btOk: Button
    val OUTRA = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("APP_OCHAMADOR", "Main: onCreate")

        this.btOk = findViewById(R.id.btMainOK)
        this.btOk.setOnClickListener({ chamaOutra(it) })
    }

    fun chamaOutra(view: View){
        var intent = Intent(this, OutraActivity::class.java)
        intent.putExtra("MSG_IDA", "Que bom! Foi!")
        //startActivity(intent)
        startActivityForResult(intent, OUTRA)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK){
            if (requestCode == OUTRA){
                Log.i("APP_OCHAMADOR", data?.getStringExtra("MSG_VOLTA"))
            }
        }else{
            Log.i("APP_OCHAMADOR", "USUÁRIO CANCELOU OUTRA")
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i("APP_OCHAMADOR", "Main: onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("APP_OCHAMADOR", "Main: onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i("APP_OCHAMADOR", "Main: onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.i("APP_OCHAMADOR", "Main: onStop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i("APP_OCHAMADOR", "Main: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("APP_OCHAMADOR", "Main: onDestroy")
    }
}
