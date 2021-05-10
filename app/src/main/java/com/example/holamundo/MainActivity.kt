package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    var numero1:double=0;
//    var numero2:double=0;
//    var operacion:int =0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{precionado("1") }
        button2.setOnClickListener{precionado("2") }
        button3.setOnClickListener{precionado("3") }
        button4.setOnClickListener{precionado("4") }
        button5.setOnClickListener{precionado("5") }
        button6.setOnClickListener{precionado("6") }
        button7.setOnClickListener{precionado("7") }
        button8.setOnClickListener{precionado("8") }
        button9.setOnClickListener{precionado("9") }
        button10.setOnClickListener{precionado("0") }


    }

    fun precionado(digito: String) {
        textView.text="${textView.text}$digito"
    }

}