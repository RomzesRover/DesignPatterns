package com.example.designpatterns.behavioral.visitor

class ProjectTest: ProjectElement {
    override fun beWritten(developer: Developer) {
        developer.create(this)
    }
}