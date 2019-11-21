package com.example.designpatterns.creational.factory

class JavaDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer {
        return JavaDeveloper()
    }
}