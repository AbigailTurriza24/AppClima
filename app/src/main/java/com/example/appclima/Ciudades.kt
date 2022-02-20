package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class Ciudades : AppCompatActivity(){

    val TAG = "com.abiturriza.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bFcp = findViewById<Button>(R.id.bFcp)
        val bTulum = findViewById<Button>(R.id.bTulum)

        bFcp.setOnClickListener(View.OnClickListener {
          val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-fcp")
            startActivity(intent)

        })
        bTulum.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-tulum")
            startActivity(intent)
        })
    }
}