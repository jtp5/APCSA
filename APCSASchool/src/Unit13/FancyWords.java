package Unit13;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = 0;

		for (int i = 0; i < wordRay.length; i++) {
			if(wordRay[i].length() > max){
				max = wordRay[i].length();
			}
		}

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < wordRay.length; j++) {
				if((wordRay[(wordRay.length - 1) - j].length()) - i >= 1){
					output += wordRay[(wordRay.length - 1) - j].charAt(wordRay[(wordRay.length - 1) - j].length() - 1 - i);
				}
				else{
					output += " ";
				}
			}
			output += "\n";
		}


		return output+"\n";
	}
}