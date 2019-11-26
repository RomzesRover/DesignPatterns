package com.example.designpatterns.behavioral.Interpreter

class AndExpression(private var expression1: Expression, private var expression2: Expression): Expression {
    override fun interpret(context: String): Boolean {
        return expression1.interpret(context) && expression2.interpret(context)
    }
}