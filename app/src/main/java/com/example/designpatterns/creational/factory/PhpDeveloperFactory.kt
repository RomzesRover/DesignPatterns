package com.example.designpatterns.creational.factory

class PhpDeveloperFactory: DeveloperFactory {
    override fun createDeveloper(): Developer {
        return PhpDeveloper()
    }
}