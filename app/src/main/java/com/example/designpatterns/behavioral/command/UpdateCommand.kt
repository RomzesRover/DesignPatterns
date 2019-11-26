package com.example.designpatterns.behavioral.command

class UpdateCommand(var database: Database): Command {
    override fun execute() {
        database.update()
    }
}