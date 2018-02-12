package Unit5;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer {
	private char theChar;

	public CharacterAnalyzer() {
		setChar('A');

	}

	public CharacterAnalyzer(char c) {
		setChar(c);

	}

	public void setChar(char c) {
		theChar = c;

	}

	public char getChar() {
		return theChar;
	}

	public boolean isUpper() {
		if (theChar >= 65 && theChar <= 90) {
			return true;
		}

		return false;
	}

	public boolean isLower() {
		if (theChar >= 97 && theChar <= 122) {
			return true;
		}

		return false;
	}

	public boolean isNumber() {
		if (theChar >= 48 && theChar <= 57) {
			return true;
		}

		return false;
	}

	public int getASCII() {
		return theChar;
	}

	public String toString() {
		if (isUpper()) {
			return getChar() + " is an upercase character. ASCII == " + getASCII() + "\n";
		}
		if (isLower()) {
			return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}
		if(isNumber()){
			return getChar() + " is a digit. ASCII == " + getASCII() + "\n";
		}
		return "This character is not a letter or digit.";
	}
}