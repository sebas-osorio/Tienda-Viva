package com.oso.loginhuerta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView
import com.bumptech.glide.Glide

class Splashscreen : AppCompatActivity() {
    val DURACION: Long = 2500;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen )
        supportActionBar?.hide()
            this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

            val logo = findViewById<ImageView>(R.id.imageView9)
        Glide.with(this).load(R.drawable.logoaphuerta).into(logo)

        cambiaractivity()

    }
    private fun cambiaractivity(){
        Handler().postDelayed(Runnable {
            val intent0 = Intent(this, MainActivity::class.java)
            startActivity(intent0)
        },DURACION)
    }}


