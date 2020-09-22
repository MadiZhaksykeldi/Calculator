package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstInput = ""
        var secondInput = ""
        var choice = ""

        btn_0.setOnClickListener { setTextFields("0") }
        btn_1.setOnClickListener { setTextFields("1") }
        btn_2.setOnClickListener { setTextFields("2") }
        btn_3.setOnClickListener { setTextFields("3") }
        btn_4.setOnClickListener { setTextFields("4") }
        btn_5.setOnClickListener { setTextFields("5") }
        btn_6.setOnClickListener { setTextFields("6") }
        btn_7.setOnClickListener { setTextFields("7") }
        btn_8.setOnClickListener { setTextFields("8") }
        btn_9.setOnClickListener { setTextFields("9") }

        btn_add.setOnClickListener {
            firstInput = math_operation.text.toString()
            choice = "+"
            math_operation.text = ""
        }

        btn_sub.setOnClickListener {
            firstInput = math_operation.text.toString()
            choice = "-"
            math_operation.text = ""
        }

        btn_mul.setOnClickListener {
            firstInput = math_operation.text.toString()
            choice = "x"
            math_operation.text = ""
        }

        btn_div.setOnClickListener {
            firstInput = math_operation.text.toString()
            choice = "÷"
            math_operation.text = ""
        }

        btn_res.setOnClickListener {
            math_operation.text = ""
        }

        btn_eql.setOnClickListener {
            secondInput = math_operation.text.toString()

            val operator = Operator()
            val result = operator.operation(
                Integer.parseInt(firstInput),
                Integer.parseInt(secondInput),
                choice
            )
            math_operation.text = result
        }

    }

    private fun setTextFields(str: String) {
        math_operation.append(str)
    }

}


