package com.example.designpatterns.behavioral.visitor

interface Developer {
    fun create(projectClass: ProjectClass)

    fun create(projectDatabase: ProjectDatabase)

    fun create(projectTest: ProjectTest)
}