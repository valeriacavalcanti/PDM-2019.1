package com.example.ocarregador

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class CarregadorReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "Eita", Toast.LENGTH_SHORT).show()
        Log.e("APP_CARREGADOR", "Eita")
    }
}
