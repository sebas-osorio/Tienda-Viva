package com.oso.loginhuerta
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.content.Intent
import java.lang.Exception

class Selectparcela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectparcela)
    }
    fun parce1(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 1", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="1"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce2(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 2", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="2"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce3(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 3", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="3"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce4(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 4", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="4"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce5(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 5", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="5"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce6(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 6", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="6"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce7(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 7", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="7"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce8(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 8", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="8"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce9(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 9", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="9"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce10(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 10", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="10"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce11(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 11", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="11"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }
    fun parce12(view: View){
        try {
            Toast.makeText(this, "Eligió parcela 12", Toast.LENGTH_SHORT).show()
            val ingreso3= Intent(applicationContext,SelectSurco::class.java)
            var eleccion:String?=intent.getStringExtra("eleccion").toString()
            var usuario:String?=intent.getStringExtra("usuario").toString()
            ingreso3.putExtra("usuario",usuario)
            ingreso3.putExtra("eleccion",eleccion)
            var eleccionparcela:String="12"
            ingreso3.putExtra("eleccionparcela",eleccionparcela)
            startActivity(ingreso3)

        }
        catch (e: Exception) {
            e.printStackTrace()
        } }

}