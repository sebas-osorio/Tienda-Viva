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

class Editartrabajador : AppCompatActivity() {

    var textobichos2: EditText? = null
    var textoagua2: EditText? = null
    var textofert2: EditText? = null
    var textosiembra12: EditText? = null
    var textosiembra22: EditText? = null
    lateinit var cambiobichos: String
    lateinit var cambiofert: String
    lateinit var cambiosiembra: String
    lateinit var cambiosiembra2: String




    lateinit var switchregar: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editartrabajador)

        textobichos2 = findViewById(R.id.textobichosindica)
        textoagua2 = findViewById(R.id.textoagua2)
        textofert2 = findViewById(R.id.textofertindica)
        textosiembra12 = findViewById(R.id.textosiembra1indica)
        textosiembra22 = findViewById(R.id.textosiembra2indica)

        var usuario: String = intent.getStringExtra("usuario").toString()
        var id: String = intent.getStringExtra("eleccionid").toString()
        val queue = Volley.newRequestQueue(this)
        val urlread = "http://192.168.0.16/android_mysql/registro.php?id=$id"

        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, urlread, null,
            Response.Listener { response ->
                textobichos2?.setText(response.getString("preventivo"))
                textoagua2?.setText(response.getString("riego"))
                textofert2?.setText(response.getString("fertilizacion"))
                textosiembra12?.setText(response.getString("cultivo1"))
                textosiembra22?.setText(response.getString("cultivo2"))


            }, Response.ErrorListener { error ->
                Toast.makeText(this, error.toString(), Toast.LENGTH_LONG).show()
            })
        queue.add(jsonObjectRequest)

        //inicio switch
        switchregar = findViewById(R.id.switchregar)

        switchregar.setOnCheckedChangeListener { _, isChecked ->
            var estado: String
            if (isChecked) {
                var id: String = intent.getStringExtra("eleccionid").toString()
                var usuario: String = intent.getStringExtra("usuario").toString()

                val url = "http://192.168.0.16/android_mysql/editar.php"
                val queue: RequestQueue = Volley.newRequestQueue(this)
                val resultadoPost = object : StringRequest(Request.Method.POST, url,
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
                        parametros.put("riego", "Regado")
                        parametros.put("ultimo_trabajador", usuario)

                        return parametros
                    }
                }
                queue.add(resultadoPost)


            } else {
            }}
        //final de switch

            //spinner 1

            var spin1 = findViewById<Spinner>(R.id.spinnerbichosadmin)
            val listabichos = resources.getStringArray(R.array.seleccionarpreventivo)
            val adaptador1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listabichos)
            spin1.adapter = adaptador1
            spin1.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    this@Editartrabajador.cambiobichos = listabichos[p2]
                    //Toast.makeText(this@Informacion,cambiobichos,Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }


            //spiner2

            var spin2 = findViewById<Spinner>(R.id.spinnerfertadmin)
            val listafert = resources.getStringArray(R.array.seleccionarfertilizante)
            val adaptador2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listafert)
            spin2.adapter = adaptador2
            spin2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    this@Editartrabajador.cambiofert = listafert[p2]
                    //Toast.makeText(this@Informacion,cambiofert,Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }


            //spiner3

            var spin4 = findViewById<Spinner>(R.id.spinnersiembraadmin)
            val listasiembra = resources.getStringArray(R.array.seleccionarsiembra1)
            val adaptador4 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listasiembra)
            spin4.adapter = adaptador4
            spin4.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    this@Editartrabajador.cambiosiembra = listasiembra[p2]
                    //Toast.makeText(this@Informacion,cambiosiembra,Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }

            //spinner4
            var spin3 = findViewById<Spinner>(R.id.spinnersiembra2admin)
            val listasiembra2 = resources.getStringArray(R.array.seleccionarsiembra2)
            val adaptador3 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listasiembra2)
            spin3.adapter = adaptador3
            spin3.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    this@Editartrabajador.cambiosiembra2 = listasiembra2[p2]
                    //Toast.makeText(this@Informacion,cambiosiembra,Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }


            //Toast.makeText(this, cambiobichos, Toast.LENGTH_SHORT).show()
            //termina la lectura

        } //aqui se cierra el oncreate

        fun clickEditar(view: View) {

            var usuario: String = intent.getStringExtra("usuario").toString()
            var id: String = intent.getStringExtra("eleccionid").toString()

            val url = "http://192.168.0.16/android_mysql/editar.php"
            val queue: RequestQueue = Volley.newRequestQueue(this)
            val resultadoPost = object : StringRequest(Request.Method.POST, url,
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
                    parametros.put("cultivo1", cambiosiembra)
                    parametros.put("cultivo2", cambiosiembra2)
                    parametros.put("fertilizacion", cambiofert)
                    parametros.put("preventivo", cambiobichos)
                    parametros.put("ultimo_trabajador", usuario)



                    return parametros
                }
            }
            queue.add(resultadoPost)


        }

        fun recolectar1(view: View) {
            var usuario: String = intent.getStringExtra("usuario").toString()
            var id: String = intent.getStringExtra("eleccionid").toString()

            val url = "http://192.168.0.16/android_mysql/editar.php"
            val queue: RequestQueue = Volley.newRequestQueue(this)
            val resultadoPost = object : StringRequest(Request.Method.POST, url,
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
                    parametros.put("cultivo1", "Sin cultivo")
                    parametros.put("ultimo_trabajador", usuario)


                    return parametros
                }
            }
            queue.add(resultadoPost)

        }

        fun recolectar2(view: View) {
            var usuario: String = intent.getStringExtra("usuario").toString()
            var id: String = intent.getStringExtra("eleccionid").toString()

            val url = "http://192.168.0.16/android_mysql/editar.php"
            val queue: RequestQueue = Volley.newRequestQueue(this)
            val resultadoPost = object : StringRequest(Request.Method.POST, url,
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
                    parametros.put("cultivo2", "Sin cultivo")
                    parametros.put("ultimo_trabajador", usuario)


                    return parametros
                }
            }
            queue.add(resultadoPost)

        }


    }
