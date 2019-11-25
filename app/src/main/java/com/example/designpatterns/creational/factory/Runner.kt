package com.example.designpatterns.creational.factory

fun run(){
    var developerFactory: DeveloperFactory = createDeveloperFactoryBySpecialty("java")
    var developer = developerFactory.createDeveloper()
    developer.writeCode()
}