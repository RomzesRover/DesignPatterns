package com.example.designpatterns.structural.proxy

class ProxyProject(private var url: String): Project {

    private lateinit var realProject: RealProject

    override fun run() {
        if (!::realProject.isInitialized){
            realProject = RealProject(url)
        }
        realProject.run()
    }
}