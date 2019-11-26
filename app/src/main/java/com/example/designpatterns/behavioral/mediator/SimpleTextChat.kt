package com.example.designpatterns.behavioral.mediator

class SimpleTextChat: Chat {
    private lateinit var admin: User
    private var users = ArrayList<User>()

    fun setAdmin(admin: Admin){
        this.admin = admin
    }

    fun addUserToChat(user: SimpleUser){
        this.users.add(user)
    }

    override fun sendMessage(message: String, user: User) {
        this.users.forEach {
            if (it != user){
                it.getMessage(message)
            }
        }
        admin.getMessage(message)
    }
}