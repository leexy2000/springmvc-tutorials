package org.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.basic.TextEditor;

public class TextEditorApp11 {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("basicbeans11.xml");
		TextEditor editor = context.getBean("textEditor",TextEditor.class);
		editor.spellCheck();
		context.close();
	}

}
