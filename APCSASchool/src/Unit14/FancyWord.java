package Unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;
	private String word;

	public FancyWord()
	{
		word = "hello";
	}

   public FancyWord(String s)
	{

	   word = s;
	   
	   for(int i=0; i < word.length(); i++)
		{
		mat[0][i] = word.charAt(i);
		mat[i][i] = word.charAt(i);
		}

	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < mat.length; i++) {
			output += (Arrays.toString(mat[i]));
		}



		return output+"\n\n";
	}
}