package com.ST10457401.imadcalculator2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var etNum1 : EditText? = null
    var etNum2 : EditText? = null
    var tvDisp : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisp = findViewById(R.id.tvDisplay)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener{add()}

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener{sub()}

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener{mul()}

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener{div()}

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener{sqr()}

        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener{pow()}

        var btnOther: Button? = findViewById(R.id.btnAdd)

        val btnNextSc= findViewById<Button>(R.id.btnNextScreen)
        btnNextSc.setOnClickListener{
            // call the next screen
            val intent = Intent(  this, MainActivity2::class.java)
            // start your activity
            startActivity(intent)
    }
    private fun add(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if (input1.isNullOrEmpty() || input.isNullOrEmpty()) {
            tvDisp?.text ="Please enter vaild numbers"
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 =input2.toInt()
        var intAnswer = 0
    }
    private fun sub(){
        val input1 = etNum1?.text?.toString()
        val input2 = etNum2?.text?.toString()

        if(input1.isNullOrEmpty() || input2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid numbers"
            return
        }
        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0
    }
    private fun mul(){}
    private fun div(){
            val input1 = etNum1.text?()
            val input2 = etNum2.text?()

        if (input1. isNullOrEmpty() || input1.isNullOrEmpty()) {
            tvDisp?.text = "Please enterr valid numbers."
            return
        }

        val intNum1 = input1.toInt()
        val intNum2 = input2.toInt()
        var intAnswer = 0

            intAnswer =intNum1 / intNum2

        tvDisp?.text = intAnswer.toString()


    }    }

    private fun sqr(){
        val
    }
    private fun pow(){
        var intNum1 = etNum1?.toString()?.toInt()?
        var intNum2 = etNum2?.toString()?.toInt()?
        var intAnswer : Int = 1

        if (input1.isNullOrEmpty() || {
                intAnswer = intAnswer * intNum1
        }
    }

}
        var intNum1 = etNum1?.toString()?.toInt()?
        var intNum2 = etNum2?.toString()?.toInt()?
        var intAnswer : Int = 0

        for (i in 1..intNum2!!){
            intAnswer = intAnswer * intNum1
        }
        tvDisp?.text = intAnswer.toString()