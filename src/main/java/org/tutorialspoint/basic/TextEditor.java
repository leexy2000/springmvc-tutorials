package org.tutorialspoint.basic;

public class TextEditor {
	private SpellChecker spellChecker;

	public TextEditor() {
		System.out.println("Inside TextEditor default constructor.");
	}

	// a constructor to inject the dependency.
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	// a setter method to inject the dependency.
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public boolean spellCheck() {
		return spellChecker.checkSpelling();
	}

}
