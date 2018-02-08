package Unit4;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		setName("Jones Pearlman");

	}

	public Name(String s)
	{
		setName(s);

	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		return name.substring(0, findSpace());
	}

	public String getLast()
	{
		return name.substring(findSpace() + 1, name.length());
	}

 	public String toString()
 	{
 		return name;
	}
 	
 	public int findSpace(){
 		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == ' '){
				return i;
			}
		}
 		return name.length() - 1;
 	}
}