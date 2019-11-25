package com.example.designpatterns.structural.decorator

class JavaTeamLead(developer: Developer): DeveloperDecorator(developer) {
    private fun sendWeekReport(): String{
        return " Send week report"
    }

    override fun makeJob(): String {
        return super.makeJob() + sendWeekReport()
    }
}