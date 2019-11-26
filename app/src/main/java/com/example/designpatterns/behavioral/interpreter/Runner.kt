package com.example.designpatterns.behavioral.interpreter

import com.example.designpatterns.PushToLog

fun run(){
    var isJava = getJavaExpression()
    var isJavaEE = getJavaEEExpression()

    PushToLog.l("Does developer know java core: ${isJava.interpret("Java Core")}")
    PushToLog.l("Does developer know java EE: ${isJavaEE.interpret("Java Spring")}")

}

fun getJavaExpression(): Expression{
    var java = TerminalExpression("Java")
    var javaCore = TerminalExpression("Java Core")

    return OrExpression(java, javaCore)
}

fun getJavaEEExpression(): Expression{
    var java = TerminalExpression("Java")
    var spring = TerminalExpression("Spring")

    return AndExpression(java, spring)
}