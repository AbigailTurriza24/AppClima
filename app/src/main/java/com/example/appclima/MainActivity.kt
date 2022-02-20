package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var twCiudad:TextView? = null
    var tvGrados:TextView? = null
    var twEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        twCiudad = findViewById(R.id.twCiudad)
        tvGrados = findViewById(R.id.tvGrado)
        twEstatus = findViewById(R.id.twEstatus)





        val ciudad = intent.getStringExtra("com.abiturriza.appclima.ciudades.CIUDAD")

        val ciudadfcp = Ciudad("Felipe Carrillo Puerto", 30, "Soleado")
        val ciudadtulum = Ciudad("Tulum", 28, "Cielo Despejado")

        if(ciudad == "ciudad-fcp") {
            //mostrar informacion de fcp
            twCiudad?.text = ciudadfcp.nombre
            tvGrados?.text = ciudadfcp.grados.toString() + "°"
            twEstatus?.text = ciudadfcp.estatus

        }else if (ciudad == "ciudad-tulum") {
            //mostrar informacion de fcp
            twCiudad?.text = ciudadtulum.nombre
            tvGrados?.text = ciudadtulum.grados.toString() + "°"
            twEstatus?.text = ciudadtulum.estatus
        }else{
            Toast.makeText(this,"No se encuentra la información", Toast.LENGTH_SHORT).show()

        }
    }
}