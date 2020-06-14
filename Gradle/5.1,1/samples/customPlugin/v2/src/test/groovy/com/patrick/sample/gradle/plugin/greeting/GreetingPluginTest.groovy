package com.patrick.sample.gradle.plugin.greeting

import static org.junit.Assert.assertTrue

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test




/**
 * 
 * @author Patrick Pan
 *
 */
class GreetingPluginTest {

	@Test
	void greeterPluginAddsGreetingTaskToProject() {
		Project project=ProjectBuilder.builder().build()
		project.pluginManager.apply 'com.patrick.sample.gradle.plugin.greeting'

		assertTrue(project.tasks.hello instanceof Greeting)
	}
}
