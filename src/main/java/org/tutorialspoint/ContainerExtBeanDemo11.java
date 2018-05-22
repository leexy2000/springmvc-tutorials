package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.containerext.HelloWorld;



public class ContainerExtBeanDemo11 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("containerextbeans11.xml");
		HelloWorld hello = context.getBean("helloWorld",HelloWorld.class);
		hello.getMessage();
		context.close();
	}

}
