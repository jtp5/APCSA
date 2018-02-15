package Unit6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("My Name is Jones", 's');
	}

	//add in second constructor
	public LetterRemover(String s, char rem){
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		String holder = "";
		int times = 0;
		int pos = 0;
		for (int i = 0; i < cleaned.length(); i++) {
			if(Character.toUpperCase(cleaned.charAt(i)) == Character.toUpperCase(lookFor)){
				if(times == 0){
					holder = cleaned.substring(pos, i);
					times++;
					pos = i + 1;
				}
				else{
					holder += cleaned.substring(pos, i);
					times++;
					pos = i + 1;
				}
			}
		}

		cleaned = holder;


		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}