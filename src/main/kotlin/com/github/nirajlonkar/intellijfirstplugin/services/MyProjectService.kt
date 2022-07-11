package com.github.nirajlonkar.intellijfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.nirajlonkar.intellijfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
