package com.example.designpatterns.structural.composite

fun run(){
    var team = Team()

    var firstJavaDeveloper: Developer = JavaDeveloper()
    var secondJavaDeveloper: Developer = JavaDeveloper()
    var pythonDeveloper: Developer = PythonDeveloper()

    team.addDeveloper(firstJavaDeveloper)
    team.addDeveloper(secondJavaDeveloper)
    team.addDeveloper(pythonDeveloper)

    team.createProject()
}