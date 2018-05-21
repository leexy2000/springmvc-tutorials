package org.tutorialspoint.quickstart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.quickstart.HelloWorld;

public class HelloWorldTest {
	
	ConfigurableApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("quickstartbeans.xml");
	}

	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void testGetMessage() {
		HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);
		assertEquals("Hello World", obj.getMessage());
	}

}
