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
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String output = "";
	private Random r = new Random();
	
	public MadLib()
	{



	}

	public MadLib(String fileName)
	{
		//load stuff
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		verbs = new ArrayList<String>();
		loadNouns();
		loadAdjectives();
		loadVerbs();
		
		
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir") + fileName));
			while(file.hasNext()){
				output += file.next();
			}
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\Unit10\\nouns.dat"));
			while(file.hasNextLine()){
				nouns.add(file.nextLine());
			}
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\Unit10\\verbs.dat"));
			while(file.hasNextLine()){
				verbs.add(file.nextLine());
			}
	
	
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\Unit10\\adjectives.dat"));
			while(file.hasNextLine()){
				adjectives.add(file.nextLine());
			}
	
	
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public String getRandomVerb()
	{

		return verbs.get(r.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		
		return nouns.get(r.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		
		return adjectives.get(r.nextInt(adjectives.size()));
	}		

	public String toString()
	{
		
	   return "The " + getRandomNoun() + " " + getRandomVerb() + " after the " + getRandomAdjective() + " " + getRandomAdjective() + " " + getRandomNoun() +  " while the " + getRandomNoun() + " " + getRandomVerb() +  " the " + getRandomNoun();
	}
}