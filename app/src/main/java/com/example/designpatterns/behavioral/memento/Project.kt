package com.example.designpatterns.behavioral.memento

import java.util.*

class Project {
    private lateinit var version: String
    private lateinit var date: Date

    fun setVersionAndDate(version: String){
        this.version = version
        this.date = Date()
    }

    fun save(): Save{
        return Save(version, date)
    }

    fun load(save: Save){
        version = save.version
        date = save.date
    }

    override fun toString(): String {
        return "{Project} version: $version Date: $date"
    }
}