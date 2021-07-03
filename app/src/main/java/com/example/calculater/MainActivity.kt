

package com.example.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAdd=findViewById<Button>(R.id.btnadd)
        val btnsubtract=findViewById<Button>(R.id.btnsubtrsct)
        val btnmultiply=findViewById<Button>(R.id.btnmultiply)
        val btnmodulus=findViewById<Button>(R.id.btnmodulus)
        val etnum1=findViewById<EditText>(R.id.etNum1)
        val etnum2=findViewById<EditText>(R.id.etNum2)
        val tvanswer=findViewById<TextView>(R.id.tvanswer)

        btnAdd.setOnClickListener {
            if (etnum1.text.toString().equals("")||etnum2.text.toString().equals("")){

                Toast.makeText(baseContext,"enter number",Toast.LENGTH_LONG).show()

            }
            else{
                val num1=etnum1.text.toString().toInt()
                val num2=etnum2.text.toString().toInt()
                val num3=num1+num2
                tvanswer.text=("Answer = $num3")
            }
        }
        btnsubtract.setOnClickListener {
            if (etnum1.text.toString().equals("")||etnum2.text.toString().equals("")){
                Toast.makeText(baseContext,"enter number",Toast.LENGTH_LONG).show()

            }
            else{
                val num1=etnum1.text.toString().toInt()
                val num2=etnum2.text.toString().toInt()
                val num3=num1-num2
                tvanswer.text=("Answer = $num3")
            }
        }
        btnmultiply.setOnClickListener {
            if (etnum1.text.toString().equals("")||etnum2.text.toString().equals("")){
                Toast.makeText(baseContext,"enter number",Toast.LENGTH_LONG).show()

            }
            else{
                val num1=etnum1.text.toString().toInt()
                val num2=etnum2.text.toString().toInt()
                val num3=num1*num2
                tvanswer.text=("Answer = $num3")
            }
        }
        btnmodulus.setOnClickListener {
            if (etnum1.text.toString().equals("")||etnum2.text.toString().equals("")){
                Toast.makeText(baseContext,"enter number",Toast.LENGTH_LONG).show()

            }
            else{
                val num1=etnum1.text.toString().toInt()
                val num2=etnum2.text.toString().toInt()
                val num3=num1%num2
                tvanswer.text=("Answer = $num3")
            }
        }
    }
}