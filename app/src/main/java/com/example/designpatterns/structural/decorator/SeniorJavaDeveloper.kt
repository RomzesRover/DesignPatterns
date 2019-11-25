package com.example.designpatterns.structural.decorator

class SeniorJavaDeveloper(developer: Developer): DeveloperDecorator(developer) {
    private fun makeCodeReview(): String{
        return " make code review"
    }

    override fun makeJob(): String {
        return super.makeJob() + makeCodeReview()
    }
}