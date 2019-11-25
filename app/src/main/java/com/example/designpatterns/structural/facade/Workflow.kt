package com.example.designpatterns.structural.facade

class Workflow {
    var job = Job()
    var bugTracker = BugTracker()
    var developer = Developer()

    fun solveProblems(){
        job.doJob()
        bugTracker.startSprint()
        developer.doJobBeforeDeadline(bugTracker)
        bugTracker.finishSprint()
        developer.doJobBeforeDeadline(bugTracker)

    }

}