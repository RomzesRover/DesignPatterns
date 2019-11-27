package com.example.designpatterns.behavioral.visitor

class ProjectDatabase: ProjectElement {
    override fun beWritten(developer: Developer) {
        developer.create(this)
    }
}