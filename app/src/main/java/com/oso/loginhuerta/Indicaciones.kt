package com.oso.loginhuerta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Indicaciones : AppCompatActivity() {

    var textobichosindica: EditText?=null
    var textofertindica: EditText?=null
    var textosiembraindica: EditText?=null
    var textosiembra2indica: EditText?=null
    lateinit var checkbichos:CheckBox
    lateinit var checkfert:CheckBox
    lateinit var checkcultivo1:CheckBox
    lateinit var checkcultivo2:CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indicaciones)

        textobichosindica=findViewById(R.id.textobichosindica)
        textofertindica=findViewById(R.id.textofertindica)
        textosiembraindica=findViewById(R.id.textosiembra1indica)
        textosiembra2indica=findViewById(R.id.textosiembra2indica)
        checkbichos=findViewById(R.id.checkboxbichos)
        checkfert=findViewById(R.id.checkboxfert)
        checkcultivo1=findViewById(R.id.checkboxcult1)
        checkcultivo2=findViewById(R.id.chechboxcult2)

        var usuario:String=intent.getStringExtra("usuario").toString()
        var id:String=intent.getStringExtra("eleccionid").toString()

        val queue= Volley.newRequestQueue(this)
        val urlread="http://192.168.0.16/android_mysql/registro.php?id=$id"


        val jsonObjectRequest= JsonObjectRequest(
            Request.Method.GET,urlread,null,
            Response.Listener { response ->
                textobichosindica?.setText(response.getString("indicacion_preventivo"))
                textofertindica?.setText(response.getString("indicacion_fertilizacion"))
                textosiembraindica?.setText(response.getString("indicacion_siembra1"))
                textosiembra2indica?.setText(response.getString("indicacion_siembra2"))


            }, Response.ErrorListener{ error->
                Toast.makeText(this,error.toString(), Toast.LENGTH_LONG).show()
            } )
        queue.add(jsonObjectRequest)

    }
    fun regreso(view:View){
        var usuario:String=intent.getStringExtra("usuario").toString()
        var eleccion: String = intent.getStringExtra("eleccion").toString()
        var eleccionparcela: String = intent.getStringExtra("eleccionparcela").toString()
        var eleccionsurco: String = intent.getStringExtra("eleccionsurco").toString()

        var ingreso7 = Intent(applicationContext, Informacion::class.java)
        ingreso7.putExtra("usuario", usuario)
        ingreso7.putExtra("eleccion", eleccion)
        ingreso7.putExtra("eleccionparcela", eleccionparcela)
        ingreso7.putExtra("eleccionsurco", eleccionsurco)
        startActivity(ingreso7)

    }
    fun reportarfun(view: View){

    if (checkbichos.isChecked){
        var id: String = intent.getStringExtra("eleccionid").toString()
        val url = "http://192.168.0.16/android_mysql/editar.php"
        val queue: RequestQueue = Volley.newRequestQueue(this)
        val resultadoPost = object : StringRequest(Request.Method.POST, url,
            Response.Listener { response ->
                //Toast.makeText(this, "Actualización exitosa!", Toast.LENGTH_SHORT).show()
            },
            Response.ErrorListener { error ->
                Toast.makeText(this, "$error", Toast.LENGTH_SHORT).show()
            }
        ) {

            override fun getParams(): MutableMap<String, String>? {

                val parametros = HashMap<String, String>()
                parametros.put("id", id!!)
                parametros.put("indicacion_preventivo", "ninguna")
                return parametros
            }
        }
        queue.add(resultadoPost)
    }

    // segundo checkbox

        if (checkfert.isChecked){
            var id: String = intent.getStringExtra("eleccionid").toString()
            val url = "http://192.168.0.16/android_mysql/editar.php"
            val queue: RequestQueue = Volley.newRequestQueue(this)
            val resultadoPost = object : StringRequest(Request.Method.POST, url,
                Response.Listener { response ->
                   // Toast.makeText(this, "Actualización exitosa!", Toast.LENGTH_SHORT).show()
                },
                Response.ErrorListener { error ->
                    Toast.makeText(this, "$error", Toast.LENGTH_SHORT).show()
                }
            ) {

                override fun getParams(): MutableMap<String, String>? {

                    val parametros = HashMap<String, String>()
                    parametros.put("id", id!!)
                    parametros.put("indicacion_fertilizacion", "ninguna")
                    return parametros
                }
            }
            queue.add(resultadoPost)
        }

        // tercer checkbox

        if (checkcultivo1.isChecked){
            var id: String = intent.getStringExtra("eleccionid").toString()
            val url = "http://192.168.0.16/android_mysql/editar.php"
            val queue: RequestQueue = Volley.newRequestQueue(this)
            val resultadoPost = object : StringRequest(Request.Method.POST, url,
                Response.Listener { response ->
                    //Toast.makeText(this, "Actualización exitosa!", Toast.LENGTH_SHORT).show()
                },
                Response.ErrorListener { error ->
                    Toast.makeText(this, "$error", Toast.LENGTH_SHORT).show()
                }
            ) {

                override fun getParams(): MutableMap<String, String>? {

                    val parametros = HashMap<String, String>()
                    parametros.put("id", id!!)
                    parametros.put("indicacion_siembra1", "ninguna")
                    return parametros
                }
            }
            queue.add(resultadoPost)
        }

        //cuarto checkbox
        if (checkcultivo2.isChecked){
            var id: String = intent.getStringExtra("eleccionid").toString()
            val url = "http://192.168.0.16/android_mysql/editar.php"
            val queue: RequestQueue = Volley.newRequestQueue(this)
            val resultadoPost = object : StringRequest(Request.Method.POST, url,
                Response.Listener { response ->
                    Toast.makeText(this, "Actualización exitosa!", Toast.LENGTH_SHORT)
                        .show()
                },
                Response.ErrorListener { error ->
                    //Toast.makeText(this, "$error", Toast.LENGTH_SHORT).show()
                }
            ) {

                override fun getParams(): MutableMap<String, String>? {

                    val parametros = HashMap<String, String>()
                    parametros.put("id", id!!)
                    parametros.put("indicacion_siembra2", "ninguna")
                    return parametros
                }
            }
            queue.add(resultadoPost)
        }

    }
}

