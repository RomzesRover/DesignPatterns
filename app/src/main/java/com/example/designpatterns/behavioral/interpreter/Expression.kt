package com.example.designpatterns.behavioral.interpreter

interface Expression {
    fun interpret(context: String): Boolean
}