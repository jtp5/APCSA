package Unit12;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}
	
	public String getWord(){
		return word;
	}

	public int compareTo( Word rhs )
	{
		if(getWord().length() > rhs.getWord().length()){
			return 1;
		}
		
		if(getWord().length() < rhs.getWord().length()){
			return -1;
		}
		
		
		return 0;
	}

	public String toString()
	{
		return getWord();
	}
}