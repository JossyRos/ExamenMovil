package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal2)

        val btnCrear = findViewById<Button>(R.id.btnCrear);
        val btnCancelar = findViewById<Button>(R.id.btnCancelar);

        btnCrear.setOnClickListener{
            val usuario = Intent(this,PaginaSiguente::class.java )
            startActivity(usuario)
        }

        btnCancelar.setOnClickListener {
            Toast.makeText(applicationContext,"Esta seguro que desea abandonar la aplicación",Toast.LENGTH_LONG).show()

        }
    }


}