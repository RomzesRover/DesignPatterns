package com.example.designpatterns.behavioral.visitor

class Project: ProjectElement {

    private var projectElements = ArrayList<ProjectElement>()

    init {
        this.projectElements.add(ProjectClass())
        this.projectElements.add(ProjectDatabase())
        this.projectElements.add(ProjectTest())
    }

    override fun beWritten(developer: Developer) {
        this.projectElements.forEach {
            it.beWritten(developer)
        }
    }
}