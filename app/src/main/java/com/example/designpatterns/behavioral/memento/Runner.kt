package com.example.designpatterns.behavioral.memento

import com.example.designpatterns.PushToLog

fun run(){
    var project = Project()
    var repo = Repo()

    PushToLog.l("Create new project: 1.0")
    project.setVersionAndDate("Version 1.0")
    PushToLog.l(project.toString())

    PushToLog.l("Saving version to repo")
    repo.save = project.save()

    PushToLog.l("Update version to 1.1")
    PushToLog.l("Write poor code")
    project.setVersionAndDate("Version 1.1")
    PushToLog.l(project.toString())

    PushToLog.l("Something went wrong")
    PushToLog.l("Rolling back version")
    project.load(repo.save)

    PushToLog.l("Project after rollback:")
    PushToLog.l(project.toString())
}