package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
		setNum(5);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for (int i = 0; i < Math.sqrt(a); i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0){
				max = i;
			}
		}


		return max;
	}

	public String toString()
	{
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		String output="";
		
		for (int i = num1; i <= number; i++) {
			while(!(greatestCommonFactor(num1, num2, 1) == 1)){
				
			}
		}





		return output+"\n";
	}
}