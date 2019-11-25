package com.example.designpatterns.structural.decorator

open class DeveloperDecorator(var developer: Developer): Developer {
    override fun makeJob(): String {
        return developer.makeJob()
    }
}