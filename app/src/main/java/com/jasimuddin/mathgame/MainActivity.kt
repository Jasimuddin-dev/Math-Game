package com.jasimuddin.mathgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var addition : Button
    lateinit var subtraction : Button
    lateinit var multi : Button
    lateinit var division:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.title = "Math Game"

        addition = findViewById(R.id.buttonAdd)
        subtraction = findViewById(R.id.buttonSub)
        multi = findViewById(R.id.buttonMul)
        division = findViewById(R.id.buttonDiv)

        addition.setOnClickListener {

            val intent = Intent(this@MainActivity, GameActivity::class.java)
            intent.putExtra("actionTitle","Addition")
            startActivity(intent)

        }
        subtraction.setOnClickListener {

            val intent = Intent(this@MainActivity,GameActivity::class.java)
            intent.putExtra("actionTitle","Subtraction")
            startActivity(intent)

        }
        multi.setOnClickListener {

            val intent = Intent(this@MainActivity,GameActivity::class.java)
            intent.putExtra("actionTitle","Multiplication")
            startActivity(intent)

        }

        division.setOnClickListener {

            val intent = Intent(this@MainActivity,GameActivity::class.java)
            intent.putExtra("actionTitle","Division")
            startActivity(intent)

        }

    }
}