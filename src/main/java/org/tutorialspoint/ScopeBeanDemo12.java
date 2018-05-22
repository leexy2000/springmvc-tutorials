package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.scope.HelloWorld;


public class ScopeBeanDemo12 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("scopebeans12.xml");
		HelloWorld hello1 = context.getBean("helloWorld",HelloWorld.class);
		hello1.setMessage("Hello Baby");
		HelloWorld hello2 = context.getBean("helloWorld",HelloWorld.class);
		hello2.getMessage();
		context.close();
	}

}
