package com.example.designpatterns.structural.composite

import com.example.designpatterns.PushToLog

class Team {
    private var developers = ArrayList<Developer>()

    fun addDeveloper(developer: Developer) {
        developers.add(developer)
    }

    fun removeDeveloper(developer: Developer){
        developers.remove(developer)
    }

    fun createProject() {
        PushToLog.l("Start creating project by team")
        developers.forEach { it.writeCode() }
    }
}
