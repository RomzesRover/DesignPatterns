package com.example.designpatterns.behavioral.command

class Developer(private var insertCommand: InsertCommand, private var updateCommand: UpdateCommand, private var selectCommand: SelectCommand, private var removeCommand: RemoveCommand) {
    fun insertRecord(){
        insertCommand.execute()
    }

    fun updateRecord(){
        updateCommand.execute()
    }

    fun selectRecord(){
        selectCommand.execute()
    }

    fun removeRecord(){
        removeCommand.execute()
    }
}