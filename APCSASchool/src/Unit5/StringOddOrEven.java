package Unit5;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		setString("Ravens");
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s.trim();

	}

 	public boolean isEven()
 	{
 		if(word.length() % 2 == 0){
 			return true;
 		}


		return false;
	}

 	public String toString()
 	{
 		String output="";
 		if(isEven() == true){
 			output = word + " is even.";
 		}
 		else{
 			output = word + " is odd.";
 		}




 		return output;
	}
}