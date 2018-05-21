package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.collections.Countries;

public class CollsBeanDemo14 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("collsbeans14.xml");

		Countries c = (Countries) context.getBean("countries");
		c.getMember();

		context.close();
	}

}
