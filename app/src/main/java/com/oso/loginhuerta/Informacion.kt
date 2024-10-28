package com.oso.loginhuerta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class Informacion : AppCompatActivity() {

    var textobichos: EditText? = null
    var textoagua: EditText? = null
    var textofert: EditText? = null
    var textosiembra: EditText? = null
    var textosiembra2: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        textobichos = findViewById(R.id.textobichosindica)
        textoagua = findViewById(R.id.textoagua2)
        textofert = findViewById(R.id.textofertindica)
        textosiembra = findViewById(R.id.textosiembra1indica)
        textosiembra2 = findViewById(R.id.textosiembra2indica)





        var usuario: String = intent.getStringExtra("usuario").toString()
        var eleccion: String = intent.getStringExtra("eleccion").toString()
        var eleccionparcela: String= intent.getStringExtra("eleccionparcela").toString()
        var eleccionsurco: String = intent.getStringExtra("eleccionsurco").toString()



        var id: String = "1"

        if (eleccionparcela == "1") {
            if (eleccionsurco == "1") {
                id = "1"
            }
            if (eleccionsurco == "2") {
                id = "2"
            }
            if (eleccionsurco == "3") {
                id = "3"
            }
        }

        if (eleccionparcela == "2") {
            if (eleccionsurco == "1") {
                id = "4"
            }
            if (eleccionsurco == "2") {
                id = "5"
            }
            if (eleccionsurco == "3") {
                id = "6"
            }
        }

        if (eleccionparcela == "3") {
            if (eleccionsurco == "1") {
                id = "7"
            }
            if (eleccionsurco == "2") {
                id = "8"
            }
            if (eleccionsurco == "3") {
                id = "9"
            }
        }

        if (eleccionparcela == "4") {
            if (eleccionsurco == "1") {
                id = "10"
            }
            if (eleccionsurco == "2") {
                id = "11"
            }
            if (eleccionsurco == "3") {
                id = "12"
            }
        }

        if (eleccionparcela == "5") {
            if (eleccionsurco == "1") {
                id = "13"
            }
            if (eleccionsurco == "2") {
                id = "14"
            }
            if (eleccionsurco == "3") {
                id = "15"
            }
        }

        if (eleccionparcela == "6") {
            if (eleccionsurco == "1") {
                id = "16"
            }
            if (eleccionsurco == "2") {
                id = "17"
            }
            if (eleccionsurco == "3") {
                id = "18"
            }
        }

        if (eleccionparcela == "7") {
            if (eleccionsurco == "1") {
                id = "19"
            }
            if (eleccionsurco == "2") {
                id = "20"
            }
            if (eleccionsurco == "3") {
                id = "21"
            }
        }

        if (eleccionparcela == "8") {
            if (eleccionsurco == "1") {
                id = "22"
            }
            if (eleccionsurco == "2") {
                id = "23"
            }
            if (eleccionsurco == "3") {
                id = "24"
            }
        }

        if (eleccionparcela == "9") {
            if (eleccionsurco == "1") {
                id = "25"
            }
            if (eleccionsurco == "2") {
                id = "26"
            }
            if (eleccionsurco == "3") {
                id = "27"
            }
        }

        if (eleccionparcela == "10") {
            if (eleccionsurco == "1") {
                id = "28"
            }
            if (eleccionsurco == "2") {
                id = "29"
            }
            if (eleccionsurco == "3") {
                id = "30"
            }
        }

        if (eleccionparcela == "11") {
            if (eleccionsurco == "1") {
                id = "31"
            }
            if (eleccionsurco == "2") {
                id = "32"
            }
            if (eleccionsurco == "3") {
                id = "33"
            }
        }

        if (eleccionparcela == "12") {
            if (eleccionsurco == "1") {
                id = "34"
            }
            if (eleccionsurco == "2") {
                id = "35"
            }
            if (eleccionsurco == "3") {
                id = "36"
            }
        }


        //Toast.makeText(this, cambiobichos, Toast.LENGTH_SHORT).show()
        val queue = Volley.newRequestQueue(this)
        val urlread = "http://192.168.0.16/android_mysql/registro.php?id=$id"


        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, urlread, null,
            Response.Listener { response ->
                textobichos?.setText(response.getString("preventivo"))
                textoagua?.setText(response.getString("riego"))
                textofert?.setText(response.getString("fertilizacion"))
                textosiembra?.setText(response.getString("cultivo1"))
                textosiembra2?.setText(response.getString("cultivo2"))


            }, Response.ErrorListener { error ->
                Toast.makeText(this, error.toString(), Toast.LENGTH_LONG).show()
            })
        queue.add(jsonObjectRequest)

        //termina la lectura

    } //aqui se cierra el oncreate

    fun actualizar(view: View) {
        var usuario: String = intent.getStringExtra("usuario").toString()
        var eleccion: String = intent.getStringExtra("eleccion").toString()
        var eleccionparcela: String = intent.getStringExtra("eleccionparcela").toString()
        var eleccionsurco: String = intent.getStringExtra("eleccionsurco").toString()

        var id: String = "1"

        if (eleccionparcela == "1") {
            if (eleccionsurco == "1") {
                id = "1"
            }
            if (eleccionsurco == "2") {
                id = "2"
            }
            if (eleccionsurco == "3") {
                id = "3"
            }
        }

        if (eleccionparcela == "2") {
            if (eleccionsurco == "1") {
                id = "4"
            }
            if (eleccionsurco == "2") {
                id = "5"
            }
            if (eleccionsurco == "3") {
                id = "6"
            }
        }

        if (eleccionparcela == "3") {
            if (eleccionsurco == "1") {
                id = "7"
            }
            if (eleccionsurco == "2") {
                id = "8"
            }
            if (eleccionsurco == "3") {
                id = "9"
            }
        }

        if (eleccionparcela == "4") {
            if (eleccionsurco == "1") {
                id = "10"
            }
            if (eleccionsurco == "2") {
                id = "11"
            }
            if (eleccionsurco == "3") {
                id = "12"
            }
        }

        if (eleccionparcela == "5") {
            if (eleccionsurco == "1") {
                id = "13"
            }
            if (eleccionsurco == "2") {
                id = "14"
            }
            if (eleccionsurco == "3") {
                id = "15"
            }
        }

        if (eleccionparcela == "6") {
            if (eleccionsurco == "1") {
                id = "16"
            }
            if (eleccionsurco == "2") {
                id = "17"
            }
            if (eleccionsurco == "3") {
                id = "18"
            }
        }

        if (eleccionparcela == "7") {
            if (eleccionsurco == "1") {
                id = "19"
            }
            if (eleccionsurco == "2") {
                id = "20"
            }
            if (eleccionsurco == "3") {
                id = "21"
            }
        }

        if (eleccionparcela == "8") {
            if (eleccionsurco == "1") {
                id = "22"
            }
            if (eleccionsurco == "2") {
                id = "23"
            }
            if (eleccionsurco == "3") {
                id = "24"
            }
        }

        if (eleccionparcela == "9") {
            if (eleccionsurco == "1") {
                id = "25"
            }
            if (eleccionsurco == "2") {
                id = "26"
            }
            if (eleccionsurco == "3") {
                id = "27"
            }
        }

        if (eleccionparcela == "10") {
            if (eleccionsurco == "1") {
                id = "28"
            }
            if (eleccionsurco == "2") {
                id = "29"
            }
            if (eleccionsurco == "3") {
                id = "30"
            }
        }

        if (eleccionparcela == "11") {
            if (eleccionsurco == "1") {
                id = "31"
            }
            if (eleccionsurco == "2") {
                id = "32"
            }
            if (eleccionsurco == "3") {
                id = "33"
            }
        }

        if (eleccionparcela == "12") {
            if (eleccionsurco == "1") {
                id = "34"
            }
            if (eleccionsurco == "2") {
                id = "35"
            }
            if (eleccionsurco == "3") {
                id = "36"
            }
        }
        if (eleccion == "1") {
            var ingreso5 = Intent(applicationContext, Editartrabajador::class.java)
            ingreso5.putExtra("usuario", usuario)
            ingreso5.putExtra("eleccionid", id)
            startActivity(ingreso5)
        }

        if (eleccion == "2") {
            var ingreso5 = Intent(applicationContext, Editaradmin::class.java)
            ingreso5.putExtra("usuario", usuario)
            ingreso5.putExtra("eleccionid", id)
            startActivity(ingreso5)
        }


    }

    fun goindicaciones(view: View) {
        var usuario: String = intent.getStringExtra("usuario").toString()
        var eleccion: String = intent.getStringExtra("eleccion").toString()
        var eleccionparcela: String = intent.getStringExtra("eleccionparcela").toString()
        var eleccionsurco: String = intent.getStringExtra("eleccionsurco").toString()

        var id: String = "1"

        if (eleccionparcela == "1") {
            if (eleccionsurco == "1") {
                id = "1"
            }
            if (eleccionsurco == "2") {
                id = "2"
            }
            if (eleccionsurco == "3") {
                id = "3"
            }
        }

        if (eleccionparcela == "2") {
            if (eleccionsurco == "1") {
                id = "4"
            }
            if (eleccionsurco == "2") {
                id = "5"
            }
            if (eleccionsurco == "3") {
                id = "6"
            }
        }

        if (eleccionparcela == "3") {
            if (eleccionsurco == "1") {
                id = "7"
            }
            if (eleccionsurco == "2") {
                id = "8"
            }
            if (eleccionsurco == "3") {
                id = "9"
            }
        }

        if (eleccionparcela == "4") {
            if (eleccionsurco == "1") {
                id = "10"
            }
            if (eleccionsurco == "2") {
                id = "11"
            }
            if (eleccionsurco == "3") {
                id = "12"
            }
        }

        if (eleccionparcela == "5") {
            if (eleccionsurco == "1") {
                id = "13"
            }
            if (eleccionsurco == "2") {
                id = "14"
            }
            if (eleccionsurco == "3") {
                id = "15"
            }
        }

        if (eleccionparcela == "6") {
            if (eleccionsurco == "1") {
                id = "16"
            }
            if (eleccionsurco == "2") {
                id = "17"
            }
            if (eleccionsurco == "3") {
                id = "18"
            }
        }

        if (eleccionparcela == "7") {
            if (eleccionsurco == "1") {
                id = "19"
            }
            if (eleccionsurco == "2") {
                id = "20"
            }
            if (eleccionsurco == "3") {
                id = "21"
            }
        }

        if (eleccionparcela == "8") {
            if (eleccionsurco == "1") {
                id = "22"
            }
            if (eleccionsurco == "2") {
                id = "23"
            }
            if (eleccionsurco == "3") {
                id = "24"
            }
        }

        if (eleccionparcela == "9") {
            if (eleccionsurco == "1") {
                id = "25"
            }
            if (eleccionsurco == "2") {
                id = "26"
            }
            if (eleccionsurco == "3") {
                id = "27"
            }
        }

        if (eleccionparcela == "10") {
            if (eleccionsurco == "1") {
                id = "28"
            }
            if (eleccionsurco == "2") {
                id = "29"
            }
            if (eleccionsurco == "3") {
                id = "30"
            }
        }

        if (eleccionparcela == "11") {
            if (eleccionsurco == "1") {
                id = "31"
            }
            if (eleccionsurco == "2") {
                id = "32"
            }
            if (eleccionsurco == "3") {
                id = "33"
            }
        }

        if (eleccionparcela == "12") {
            if (eleccionsurco == "1") {
                id = "34"
            }
            if (eleccionsurco == "2") {
                id = "35"
            }
            if (eleccionsurco == "3") {
                id = "36"
            }
        }

            var ingreso9 = Intent(applicationContext, Indicaciones::class.java)
        ingreso9.putExtra("eleccionid",id)
        ingreso9.putExtra("usuario", usuario)
        ingreso9.putExtra("eleccion", eleccion)
             ingreso9.putExtra("eleccionparcela", eleccionparcela)
        ingreso9.putExtra("eleccionsurco", eleccionsurco)

        startActivity(ingreso9)

        }
    }

