package com.example.designpatterns.behavioral.command

fun run(){
    var database = Database()
    var developer = Developer(InsertCommand(database), UpdateCommand(database), SelectCommand(database), RemoveCommand(database))

    developer.insertRecord()
    developer.selectRecord()
    developer.updateRecord()
    developer.removeRecord()
}