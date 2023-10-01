package com.example.examen

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PaginaSiguente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_siguente)

        val btnSalir :Button = findViewById(R.id.btnSalir )

        btnSalir.setOnClickListener{
            val titulo:String = "Confirmar cierre"
            val mensaje:String = "¿Esta seguro que desea abandonar la aplicación?"

            showModalConfirmExit(titulo,mensaje);
        }
    }

    private fun showModalConfirmExit(titleMsg: String, bodyMsg: String) {
        val dialogConfirm = Dialog(this)
        dialogConfirm.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogConfirm.setCancelable(false)
        dialogConfirm.setContentView(R.layout.model_salir)
        dialogConfirm.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val titulo: TextView = dialogConfirm.findViewById(R.id.modalTITULO)
        val mensaje: TextView = dialogConfirm.findViewById(R.id.modalMensaje)
        val btnAceptar:Button = dialogConfirm.findViewById(R.id.btnModalSi)
        val btnCancelar:Button = dialogConfirm.findViewById(R.id.btnModalNo)

        titulo.text=titleMsg
        mensaje.text=bodyMsg

        btnAceptar.setOnClickListener{
            val PantallaScreen = Intent(this,Principal::class.java)
            startActivity(PantallaScreen)
        }
        btnCancelar.setOnClickListener{
            Toast.makeText(this,"Se quedo en la segunda pagina", Toast.LENGTH_LONG).show()
            dialogConfirm.dismiss()
        }
        dialogConfirm.show()
    }

}