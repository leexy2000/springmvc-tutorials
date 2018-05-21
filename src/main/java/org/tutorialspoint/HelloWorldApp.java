package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.quickstart.HelloWorld;

public class HelloWorldApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("quickstartbeans.xml");
		HelloWorld hello = context.getBean("helloWorld",HelloWorld.class);
		hello.getMessage();
		context.close();
	}

}
