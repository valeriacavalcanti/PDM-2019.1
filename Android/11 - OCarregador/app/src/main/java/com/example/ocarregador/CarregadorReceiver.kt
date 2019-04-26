package com.example.ocarregador

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class CarregadorReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_POWER_CONNECTED){
            Toast.makeText(context, "Quîî bom!", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "Êêêêita", Toast.LENGTH_SHORT).show()
        }
    }
}
