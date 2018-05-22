package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.containerext.BasicDataSource;


public class ContainerExtBeanDemo12 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("containerextbeans12.xml");
		BasicDataSource ds = context.getBean("dataSource",BasicDataSource.class);
		ds.showMessage();
		context.close();
	}

}
