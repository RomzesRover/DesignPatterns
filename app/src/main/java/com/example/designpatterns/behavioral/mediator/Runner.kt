package com.example.designpatterns.behavioral.mediator

fun run(){
    var chat = SimpleTextChat()
    var admin = Admin(chat, "Admin")
    var user1 = SimpleUser(chat, "User 1")
    var user2 = SimpleUser(chat, "User 2")

    chat.setAdmin(admin)
    chat.addUserToChat(user1)
    chat.addUserToChat(user2)

    user1.sendMessage("Hello Iam user 1")
    admin.sendMessage("Hello I got it 1")
}