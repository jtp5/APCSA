package Unit10;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
	private String data;

	public Histogram()
	{




	}

	public Histogram(char[] values, String fName)
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		fileName = fName;
		for (int i = 0; i < values.length; i++) {
			letters.add(values[i]);
		}
		for (int i = 0; i < values.length; i++) {
			count.add(0);
		}





		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+fileName));
			while(file.hasNextLine()){
				data += file.nextLine();
			}
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	

		for (int i = 0; i < letters.size(); i++) {
			for (int j = 0; j < data.length(); j++) {
				if(letters.get(i) == data.charAt(j)){
					count.set(i, count.get(i) + 1);
				}
			}
		}





	}

	public char mostFrequent()
	{
		
		int holder = 0;
		for (int i = 0; i < count.size(); i++) {
			if(count.get(i) > count.get(holder)){
				holder = i;
			}
		}
		
		return letters.get(holder);
	}

	public char leastFrequent()
	{
		int holder = 0;
		for (int i = 0; i < count.size(); i++) {
			if(count.get(i) < count.get(holder)){
				holder = i;
			}
		}
		
		return letters.get(holder);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}