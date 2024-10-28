package com.oso.loginhuerta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Editaradmin : AppCompatActivity() {
    var textobichosindicar: EditText? = null
    var textofertindicar: EditText? = null
    var textosiembra1indicar: EditText? = null
    var textosiembra2indicar: EditText? = null

    lateinit var cambiobichos: String
    lateinit var cambiofert: String
    lateinit var cambiosiembra: String
    lateinit var cambiosiembra2: String




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editaradmin)

        textobichosindicar=findViewById(R.id.textobichosindica)
        textofertindicar=findViewById(R.id.textofertindica)
        textosiembra1indicar=findViewById(R.id.textosiembra1indica)
        textosiembra2indicar=findViewById(R.id.textosiembra2indica)

        var id: String = intent.getStringExtra("eleccionid").toString()
        var usuario: String = intent.getStringExtra("usuario").toString()


        val queue = Volley.newRequestQueue(this)
        val urlread = "http://192.168.0.16/android_mysql/registro.php?id=$id"

        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, urlread, null,
            Response.Listener { response ->
                textobichosindicar?.setText(response.getString("indicacion_preventivo"))
                textofertindicar?.setText(response.getString("indicacion_fertilizacion"))
                textosiembra1indicar?.setText(response.getString("indicacion_siembra1"))
                textosiembra2indicar?.setText(response.getString("indicacion_siembra2"))


            }, Response.ErrorListener { error ->
                Toast.makeText(this, error.toString(), Toast.LENGTH_LONG).show()
            })
        queue.add(jsonObjectRequest)

        //spinner 1

        var spin1 = findViewById<Spinner>(R.id.spinnerbichosadmin)
        val listabichos = resources.getStringArray(R.array.seleccionarpreventivoadmin)
        val adaptador1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listabichos)
        spin1.adapter = adaptador1
        spin1.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                this@Editaradmin.cambiobichos = listabichos[p2]
                //Toast.makeText(this@Informacion,cambiobichos,Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


        //spiner2

        var spin2 = findViewById<Spinner>(R.id.spinnerfertadmin)
        val listafert = resources.getStringArray(R.array.seleccionarfertilizanteadmin)
        val adaptador2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listafert)
        spin2.adapter = adaptador2
        spin2.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                this@Editaradmin.cambiofert = listafert[p2]
                //Toast.makeText(this@Informacion,cambiofert,Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


        //spiner3

        var spin4 = findViewById<Spinner>(R.id.spinnersiembraadmin)
        val listasiembra = resources.getStringArray(R.array.seleccionarsiembra1admin)
        val adaptador4 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listasiembra)
        spin4.adapter = adaptador4
        spin4.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                this@Editaradmin.cambiosiembra = listasiembra[p2]
                //Toast.makeText(this@Informacion,cambiosiembra,Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        //spinner4
        var spin3 = findViewById<Spinner>(R.id.spinnersiembra2admin)
        val listasiembra2 = resources.getStringArray(R.array.seleccionarsiembra2admin)
        val adaptador3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listasiembra2)
        spin3.adapter = adaptador3
        spin3.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                this@Editaradmin.cambiosiembra2 = listasiembra2[p2]
                //Toast.makeText(this@Informacion,cambiosiembra,Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


    } //aqui cierra el oncreate



    fun clickEditaradmin(view: View) {

        var id: String = intent.getStringExtra("eleccionid").toString()
        val url = "http://192.168.0.16/android_mysql/editar.php"
        val queue: RequestQueue = Volley.newRequestQueue(this)
        val resultadoPost = object : StringRequest(
            Request.Method.POST, url,
            Response.Listener { response ->
                Toast.makeText(this, "Actualización exitosa!", Toast.LENGTH_SHORT)
                    .show()
            },
            Response.ErrorListener { error ->
                Toast.makeText(this, "$error", Toast.LENGTH_SHORT).show()
            }
        ) {

            override fun getParams(): MutableMap<String, String>? {

                val parametros = HashMap<String, String>()
                parametros.put("id", id!!)
                parametros.put("indicacion_siembra1", cambiosiembra)
                parametros.put("indicacion_siembra2", cambiosiembra2)
                parametros.put("indicacion_fertilizacion", cambiofert)
                parametros.put("indicacion_preventivo", cambiobichos)


                return parametros
            }
        }
        queue.add(resultadoPost)


    }


}

