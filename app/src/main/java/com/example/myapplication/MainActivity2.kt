package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private var txtRecibeNombre:TextView?=null
    private var txtRecibeGenero:TextView?=null
    private var txtRecibeFecha:TextView?=null
    private var txtRecibeTelefono:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        txtRecibeNombre=findViewById(R.id.txtRecibeNombre)
        txtRecibeGenero=findViewById(R.id.txtRecibeGenero)
        txtRecibeFecha=findViewById(R.id.txtRecibeFecha)
        txtRecibeTelefono=findViewById(R.id.txtRecibeTelefono)

        val  nombre= intent.getStringExtra("nombre")
        val  genero= intent.getStringExtra("genero")
        val  fecha= intent.getStringExtra("fecha")
        val  telefono= intent.getStringExtra("telefono")

        txtRecibeNombre?.text="$nombre"
        txtRecibeGenero?.text="$genero"
        txtRecibeFecha?.text="$fecha"
        txtRecibeTelefono?.text="$telefono"
    }
}