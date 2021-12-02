package com.example.myapplicationa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

var drawL:DrawerLayout? = null
var toolbar:Toolbar?= null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar!!)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    fun conectView (){
        drawL = findViewById(R.id.Dr)
        toolbar =findViewById(R.id.toolbar)
    }
}

