package com.oso.loginhuerta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.lang.Exception

class SelectSurco : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_surco)
    }
    fun funsurco1(view: View){
        try {
            Toast.makeText(this, "Eligió surco 1", Toast.LENGTH_SHORT).show()
            val ingreso4= Intent(applicationContext,Informacion::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var eleccionparcela:String=intent.getStringExtra("eleccionparcela").toString()
            var eleccionsurco:String="1"
            var usuario=intent.getStringExtra("usuario").toString()
            ingreso4.putExtra("usuario",usuario)
            ingreso4.putExtra("eleccionsurco",eleccionsurco)
            ingreso4.putExtra("eleccionparcela",eleccionparcela)
            ingreso4.putExtra("eleccion",eleccion)
            startActivity(ingreso4)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun funsurco2(view: View){
        try {
            Toast.makeText(this, "Eligió surco 2", Toast.LENGTH_SHORT).show()
            val ingreso4= Intent(applicationContext,Informacion::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var eleccionparcela:String=intent.getStringExtra("eleccionparcela").toString()
            var eleccionsurco:String="2"
            var usuario=intent.getStringExtra("usuario").toString()
            ingreso4.putExtra("usuario",usuario)
            ingreso4.putExtra("eleccionsurco",eleccionsurco)
            ingreso4.putExtra("eleccionparcela",eleccionparcela)
            ingreso4.putExtra("eleccion",eleccion)
            startActivity(ingreso4)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun funsurco3(view: View){
        try {
            Toast.makeText(this, "Eligió surco 3", Toast.LENGTH_SHORT).show()
            val ingreso4= Intent(applicationContext,Informacion::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var eleccionparcela:String=intent.getStringExtra("eleccionparcela").toString()
            var eleccionsurco:String="3"
            var usuario=intent.getStringExtra("usuario").toString()
            ingreso4.putExtra("usuario",usuario)
            ingreso4.putExtra("eleccionsurco",eleccionsurco)
            ingreso4.putExtra("eleccionparcela",eleccionparcela)
            ingreso4.putExtra("eleccion",eleccion)
            startActivity(ingreso4)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
}