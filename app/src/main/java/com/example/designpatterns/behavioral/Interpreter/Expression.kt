package com.example.designpatterns.behavioral.Interpreter

interface Expression {
    fun interpret(context: String): Boolean
}