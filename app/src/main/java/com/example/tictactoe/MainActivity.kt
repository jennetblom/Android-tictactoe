package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button1:Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button
    lateinit var button5:Button
    lateinit var button6:Button
    lateinit var button7:Button
    lateinit var button8:Button
    lateinit var button9:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)
        button5=findViewById(R.id.button5)
        button6=findViewById(R.id.button6)
        button7=findViewById(R.id.button7)
        button8=findViewById(R.id.button8)
        button9=findViewById(R.id.button9)



    }
}