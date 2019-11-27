package com.example.designpatterns.behavioral.visitor

class ProjectClass: ProjectElement {
    override fun beWritten(developer: Developer) {
        developer.create(this)
    }
}