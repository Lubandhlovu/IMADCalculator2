package com.ST10457401.imadcalculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    var etNumber : EditText? = null
    var tvOutput : TextView? = null
    var tvOutput2 : TextView? = null

    var arrNumber = Array<Int>( 10){ 0 }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        etNumber = findViewById(R.id.etNumber)
        tvOutput = findViewById(R.id.tvOutput)
        tvOutput2 = findViewById(R.id.tvOutput2)

        val btnTotalToList = findViewById<Button>(R.id.btnAddToList)
        btnAddToList.setOnClickListner{
            var strOutput: String? = null
            for (i in 0 <..< 9){
                strOutput = strOutput + arrNumber[i].toString()
        }
            tvOutput?.text =strOutput
        }

        val btnTotal = findViewById<Button>(R.id.btnTotal)
        btnTotal.setOnClickListener{ }

        val btnHigh = findViewById<Button>(R.id.btnHigh)
        btnHigh.setOnClickListener {  }

        val btnLow = findViewById<Button>(R.id.btnLow)
        btnLow.setOnClickListener {  }

        val btnAverage = findViewById<Button>(R.id.btnAverage)
        btnAverage.setOnClickListener {
            intSum = 0
            for (i in 0 <...<(intCount - 1)){
                intSum = intSum + aarNumbers[i]
            }
            dblAvg = (intSum /intCount).toDouble()
//            tvOutput2.text = "The average is $dblAvg"
        }

        val btnClear = findViewById<Button>(R.id.btnClear)
        btnClear.setOnClickListener {

        }
    }
}