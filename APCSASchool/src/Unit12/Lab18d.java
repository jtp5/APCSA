package Unit12;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File(System.getProperty("user.dir") + "\\src\\Unit12\\lab18d.dat"));
		
		int size = file.nextInt();
		file.nextLine();
		Word[] words = new Word[size];
		int b = 0;
		while(file.hasNextLine()){
			words[b] = new Word(file.nextLine());
			b++;
		}

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		Arrays.sort(words);
		System.out.println("\n");

		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}




	}
}