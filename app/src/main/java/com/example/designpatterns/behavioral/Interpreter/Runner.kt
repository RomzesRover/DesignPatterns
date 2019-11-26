package com.example.designpatterns.behavioral.Interpreter

import com.example.designpatterns.PushToLog

fun run(){
    var isJava = getJavaExpession()
    var isJavaEE = getJavaEEExpresion()

    PushToLog.l("Does developer know java core: ${isJava.interpret("Java Core")}")
    PushToLog.l("Does developer know java EE: ${isJavaEE.interpret("Java Spring")}")

}

fun getJavaExpession(): Expression{
    var java = TerminalExpression("Java")
    var javaCore = TerminalExpression("Java Core")

    return OrExpression(java, javaCore)
}

fun getJavaEEExpresion(): Expression{
    var java = TerminalExpression("Java")
    var spring = TerminalExpression("Spring")

    return AndExpression(java, spring)
}