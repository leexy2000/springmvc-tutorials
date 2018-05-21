package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.collections.MailAddress;

public class CollsBeanDemo12 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("collsbeans12.xml");

		MailAddress ma = (MailAddress) context.getBean("address");
		ma.getAddress();

		context.close();
	}

}
