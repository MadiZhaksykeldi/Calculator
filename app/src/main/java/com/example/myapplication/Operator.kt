package com.example.myapplication

class Operator {
    private fun add(x: Int, y: Int): String = (x + y).toString()
    private fun sub(x: Int, y: Int): String = (x - y).toString()
    private fun mul(x: Int, y: Int): String = (x * y).toString()
    private fun div(x: Int, y: Int): String = (x / y).toString()

    fun operation(n1: Int, n2: Int, c: String): String {
        var res = ""
        when (c) {
            "+" -> res = add(n1, n2)
            "-" -> res = sub(n1, n2)
            "x" -> res = mul(n1, n2)
            "÷" -> res = div(n1, n2)
        }
        return res
    }
}