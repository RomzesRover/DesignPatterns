package com.example.designpatterns.creational.factory

class CppDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer {
        return CppDeveloper()
    }
}