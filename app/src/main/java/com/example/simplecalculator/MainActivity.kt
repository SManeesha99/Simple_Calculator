package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.simplecalculator.models.Calculator


lateinit var editNumber1:EditText
lateinit var edit_Number2:EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNumber1 = findViewById(R.id.editNumber1)
        edit_Number2 = findViewById(R.id.edit_Number2)

        fun buttonClick(v:View){
            var ans = 0.0
            val calculator = Calculator(
                editNumber1.text.toString().toDouble(),
                edit_Number2.text.toString().toDouble()
            )

            when(v.id){
                R.id.btnPlus -> ans = calculator.add()
                R.id.btnMinus -> ans = calculator.subtract()
                R.id.btnMuliply -> ans = calculator.multyply()
                R.id.btnDivide -> ans = calculator.devide()
            }

            println(ans)
            val intent = Intent(this, Display::class.java)
            intent.putExtra("answer",ans)
            startActivity(intent)
            finish()
        }

        val btnPlus = findViewById<Button>(R.id.btnPlus)
        btnPlus.setOnClickListener { buttonClick(it) }

        val btnMinus = findViewById<Button>(R.id.btnMinus)
        btnMinus.setOnClickListener { buttonClick(it) }

        val btnMultiply = findViewById<Button>(R.id.btnMuliply)
        btnMultiply.setOnClickListener { buttonClick(it) }

        val btnDivide = findViewById<Button>(R.id.btnDivide)
        btnDivide.setOnClickListener { buttonClick(it) }



    }
}