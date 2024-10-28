package com.oso.loginhuerta
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.content.Intent
import java.lang.Exception
class MainActivity : AppCompatActivity() {


          override fun onCreate(savedInstanceState: Bundle?) {
               setContentView(R.layout.activity_main)
              super.onCreate(savedInstanceState)

    }
    fun profile1(view: View){
        try {
            Toast.makeText(this, "Ingresó como Administrador",Toast.LENGTH_SHORT).show()
            var ingreso= Intent(applicationContext,Ingresar::class.java)
            var eleccion = "2"
            ingreso.putExtra("eleccion",eleccion)
            startActivity(ingreso)

        }
         catch (e: Exception) {
            e.printStackTrace()
        }


    }
    fun profile2(view: View){
        Toast.makeText(this, "Ingresó como Trabajador",Toast.LENGTH_SHORT).show()
        val ingreso=Intent(applicationContext,Ingresar::class.java)
        var eleccion = "1"
                ingreso.putExtra("eleccion",eleccion)
        startActivity(ingreso)
    }


}
