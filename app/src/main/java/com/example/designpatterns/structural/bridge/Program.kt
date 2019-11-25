package com.example.designpatterns.structural.bridge

abstract class Program internal constructor(protected var developer: Developer) {
    abstract fun developProgram()
}