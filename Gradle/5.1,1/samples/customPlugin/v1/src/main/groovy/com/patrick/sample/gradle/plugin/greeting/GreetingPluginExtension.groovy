package com.patrick.sample.gradle.plugin.greeting

import org.gradle.api.Project
import org.gradle.api.provider.Property

/**
 * 
 * @author Patrick Pan
 *
 */
class GreetingPluginExtension{
	final Property<String> message

	GreetingPluginExtension(Project project){
		message=project.objects.property(String)
		message.set('Hello from Patrick')
	}
}
