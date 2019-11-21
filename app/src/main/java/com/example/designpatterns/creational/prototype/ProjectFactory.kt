package com.example.designpatterns.creational.prototype

class ProjectFactory(var project: Project) {
    fun cloneProject(): Project{
        return project.copy()
    }
}