package com.example.designpatterns.structural.bridge

fun run(){
    var programs = arrayOf(BankSystem(JavaDeveloper()), StockExchange(CppDeveloper()))
    programs.forEach { it.developProgram() }
}