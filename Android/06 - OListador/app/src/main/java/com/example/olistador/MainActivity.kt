package com.example.olistador

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var lvCampi: ListView
    private lateinit var ifpb: IFPB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.ifpb = IFPB()

        this.lvCampi = findViewById(R.id.lvCampi)

        this.lvCampi.adapter = ArrayAdapter<Campus>(this, android.R.layout.simple_list_item_1, this.ifpb.get())

        this.lvCampi.setOnItemClickListener(OnClickLista())
        this.lvCampi.setOnItemLongClickListener(OnLongClickLista())
    }

    inner class OnClickLista : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            val campus = ifpb.get(position)
            Toast.makeText(this@MainActivity, campus.url, Toast.LENGTH_SHORT).show()
        }
    }

    inner class OnLongClickLista: AdapterView.OnItemLongClickListener{
        override fun onItemLongClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long): Boolean {
            val campus = ifpb.get(position)
            Log.i("APP_IFPB", campus.url)
            val it = Intent()
            it.putExtra("URL", campus.url)
            setResult(Activity.RESULT_OK, it)
            finish()
            return true
        }
    }
}
