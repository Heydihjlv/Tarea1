package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    private var txtNombre:EditText?=null
    private var rbFemenino:RadioButton?=null
    private var rbMasculino:RadioButton?=null
    private var txtFecha:EditText?=null
    private var txtTelefono:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNombre=findViewById(R.id.txtNombre)
        rbFemenino=findViewById(R.id.rbFemenino)
        rbMasculino=findViewById(R.id.rbMasculino)
        txtFecha=findViewById(R.id.txtFecha)
        txtTelefono=findViewById(R.id.txtTelefono)

    }
    fun enviarInformacion(view:View){
        var nombre=txtNombre?.text.toString()
        var genero: String
        var fecha=txtFecha?.text.toString()
        var telefono=txtTelefono?.text.toString()

        if(rbFemenino?.isChecked()==true)
            genero=rbFemenino?.text.toString()
        else
            genero=rbMasculino?.text.toString()
        var intent= Intent(this, MainActivity2::class.java)

        intent.putExtra("nombre",nombre)
        intent.putExtra("genero",genero)
        intent.putExtra("fecha",fecha)
        intent.putExtra("telefono",telefono)


        startActivity(intent)

    }
}