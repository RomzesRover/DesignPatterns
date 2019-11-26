package com.example.designpatterns.behavioral.command

class RemoveCommand(var database: Database): Command {
    override fun execute() {
        database.remove()
    }
}