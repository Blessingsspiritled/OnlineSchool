package com.example.onlineschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun Register_btn (view: View) {

        startActivity(Intent(this@MainActivity, Register_Activity::class.java))
    }
    fun Login_btn (view: View) {

        startActivity(Intent(this@MainActivity, Login_Activity::class.java))
}
}