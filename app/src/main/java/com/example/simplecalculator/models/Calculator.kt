package com.example.simplecalculator.models

class Calculator(private val number1:Double, private val number2:Double) {

    fun add() = number1+number2
    fun subtract() = number1 - number2
    fun multyply() = number1 * number2
    fun devide() = number1 / number2
}