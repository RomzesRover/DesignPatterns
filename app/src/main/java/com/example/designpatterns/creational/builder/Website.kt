package com.example.designpatterns.creational.builder

class Website {
    lateinit var name: String
    lateinit var cms: Cms
    var price = 0

    override fun toString(): String {
        return "Website{name: $name, cms: $cms, price: $price}"
    }
}