package com.example.designpatterns.behavioral.command

class InsertCommand(var database: Database): Command {
    override fun execute() {
        database.insert()
    }
}