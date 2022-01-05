package com.github.zhhzjh.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.zhhzjh.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
