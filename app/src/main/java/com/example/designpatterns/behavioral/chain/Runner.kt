package com.example.designpatterns.behavioral.chain

fun run(){
    var reportNotifier = SimpleReportNotifier(ROUTINE)
    var emailNotifier = EmailNotifier(IMPORTANT)
    var smsNotifier = SMSNotifier(ASAP)

    reportNotifier.setNextNotifier(emailNotifier)
    emailNotifier.setNextNotifier(smsNotifier)

    reportNotifier.notifyManager("Everything is ok", ROUTINE)
    reportNotifier.notifyManager("Something went wrong", IMPORTANT)
    reportNotifier.notifyManager("Houston we've had a problem here", ASAP)
}