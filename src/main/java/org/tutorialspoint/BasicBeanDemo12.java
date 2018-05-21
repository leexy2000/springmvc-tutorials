package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.basic.TextEditor;

public class BasicBeanDemo12 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("basicbeans12.xml");

		TextEditor editor = (TextEditor) context.getBean("textEditor");
		editor.spellCheck();
		
		context.close();
	}

}
