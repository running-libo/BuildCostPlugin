package com.github.buildcostplugin;

import org.gradle.api.Plugin
import org.gradle.api.Project

class BuildCostPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        //gradle添加task执行监听
        //gradle.addListener(new BuildTimeListener())
        project.getGradle().addListener(new BuildTimeListener())
    }
}