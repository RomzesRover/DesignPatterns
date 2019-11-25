package com.example.designpatterns.structural.flyweight

fun run(){
    var developerFactory = DeveloperFactory()
    var developers = ArrayList<Developer?>()

    developers.add(developerFactory.getDeveloperBySpeciallity("java"))
    developers.add(developerFactory.getDeveloperBySpeciallity("java"))
    developers.add(developerFactory.getDeveloperBySpeciallity("java"))
    developers.add(developerFactory.getDeveloperBySpeciallity("java"))
    developers.add(developerFactory.getDeveloperBySpeciallity("c++"))
    developers.add(developerFactory.getDeveloperBySpeciallity("c++"))
    developers.add(developerFactory.getDeveloperBySpeciallity("c++"))
    developers.add(developerFactory.getDeveloperBySpeciallity("c++"))

    developers.forEach { it?.let { it.writeCode() } }
}