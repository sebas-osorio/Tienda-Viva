package com.oso.loginhuerta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.lang.Exception

class Ingresar : AppCompatActivity() {
    lateinit var usuarioText:EditText
    lateinit var contrasenaText:EditText
    var usuario:String="***"
    var contrasena:String="**"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar)
        usuarioText=findViewById(R.id.textoUsuario) as EditText
        contrasenaText=findViewById(R.id.textoContrasena) as EditText

    }
    fun ingreso(view: View){
        try {
            val usuariostrabajadores= mapOf( "trabajador1" to "caro123",  "trabajador2" to "sebas123",  "trabajador3" to "manuel123")
            val usuariosadmins= mapOf( "admin1" to "paul123",  "admin2" to "david123")
            var ingreso2 = Intent(applicationContext, Selectparcela::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            ingreso2.putExtra("eleccion",eleccion)

            usuario= usuarioText.text.toString()
            contrasena=contrasenaText.text.toString()

            var perfil=usuario
            if (eleccion=="1"){
            if(usuario in usuariostrabajadores) {
                if (contrasena==usuariostrabajadores.get(usuario)){
                    Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
                    var ingreso2 = Intent(applicationContext, Selectparcela::class.java)
                    var eleccion:String?=intent.getStringExtra("eleccion").toString()
                    ingreso2.putExtra("usuario",usuario)
                    ingreso2.putExtra("eleccion",eleccion)
                    startActivity(ingreso2)
            }
                else{
                    Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show()
                }}
            else{
            Toast.makeText(this, "Su cuenta no es de trabajador", Toast.LENGTH_SHORT).show()
        }}


            if (eleccion=="2"){
                if(usuario in usuariosadmins) {
                    if (contrasena==usuariosadmins.get(usuario)){
                        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
                        var ingreso2 = Intent(applicationContext, Selectparcela::class.java)
                        var eleccion:String?=intent.getStringExtra("eleccion").toString()
                        ingreso2.putExtra("eleccion",eleccion)
                        ingreso2.putExtra("usuario",usuario)
                        startActivity(ingreso2)
                    }
                    else{
                        Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show()
                    }}
                else{
                    Toast.makeText(this, "Su cuenta no es de administrador", Toast.LENGTH_SHORT).show()
                }
                }


        }
        catch (e: Exception) {
            e.printStackTrace()
        } }

}