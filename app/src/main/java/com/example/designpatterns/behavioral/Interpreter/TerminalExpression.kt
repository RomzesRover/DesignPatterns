package com.example.designpatterns.behavioral.Interpreter

class TerminalExpression(private var data: String): Expression {
    override fun interpret(context: String): Boolean {
        return context.contains(data)
    }
}