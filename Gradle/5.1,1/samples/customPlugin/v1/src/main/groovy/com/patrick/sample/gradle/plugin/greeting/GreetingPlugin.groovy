package com.patrick.sample.gradle.plugin.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 
 * @author Patrick Pan
 *
 */
class GreetingPlugin implements Plugin<Project>{
	void apply(Project project){
		def extension=project.extensions.create('greeting',GreetingPluginExtension,project)
		project.tasks.create('hello',Greeting){ message=extension.message }
	}
}
