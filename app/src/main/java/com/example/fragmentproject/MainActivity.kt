package com.example.fragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dwightButton(view: View) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, BlankFragment())
            .commit()
    }
    fun michaelButton(view: View) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, BlankFragment2())
            .commit()
    }
    fun pamButton(view: View) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, BlankFragment3())
            .commit()
    }    fun jimButton(view: View) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, BlankFragment4())
            .commit()
    }

}