package com.example.designpatterns.creational.prototype

class Project(var id: Int, var projectName: String, var sourceCode: String): Copyable {

    override fun copy(): Project {
        return Project(id, projectName, sourceCode)
    }

    override fun toString(): String {
        return "Project{id: $id, projectName: $projectName, sourceCode: $sourceCode}"
    }
}