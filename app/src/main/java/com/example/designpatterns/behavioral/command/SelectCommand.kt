package com.example.designpatterns.behavioral.command

class SelectCommand(var database: Database): Command {
    override fun execute() {
        database.select()
    }
}