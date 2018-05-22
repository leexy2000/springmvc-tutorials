package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.lifecycle.HelloWorld;


public class LifeCycleBeanDemo11 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecyclebeans11.xml");
		HelloWorld hello = context.getBean("helloWorld",HelloWorld.class);
		hello.getMessage();
		context.close();
	}

}
