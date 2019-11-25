package com.example.designpatterns.structural.proxy

import com.example.designpatterns.PushToLog

class RealProject(private var url: String): Project {

    init {
        load()
    }

    private fun load(){
        PushToLog.l("Load project from $url ...")
    }

    override fun run() {
        PushToLog.l("Running project from $url ...")
    }
}