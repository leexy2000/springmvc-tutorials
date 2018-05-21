package org.tutorialspoint.basic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tutorialspoint.basic.TextEditor;

public class TextEditorTest {

	ConfigurableApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("basicbeans11.xml");
	}

	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void testSpellCheck() {
		TextEditor editor = (TextEditor) context.getBean("textEditor");
		assertTrue(editor.spellCheck());
	}

}
