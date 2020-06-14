package com.patrick.sample.gradle.plugin.greeting

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.TaskAction

/**
 * 
 * @author Patrick Pan
 *
 */
class Greeting extends DefaultTask{
	final Property<String> message=project.objects.property(String)

	@TaskAction
	void printMessage(){
		println message.get()
	}
}