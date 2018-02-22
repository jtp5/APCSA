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
		for (int i = 1; i <= 9000; i++) {
			if(a % i == 0 && b % i == 0 && c % i == 0){
				max = i;
			}
		}


		return max;
	}

	public String toString()
	{
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String output="";
		
		for (int i = 1; i <= number; i++) {
			
			for (int j = 1; j <= number; j++) {
				
				for (int k = 1; k <= number; k++) {
					
					if((Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2))){
						if(i % 2 == 0){
							if(j % 2 == 1){
								if(greatestCommonFactor(i, j, k) == 1){
									if (j > i){
										output+= i + " " + j + " " + k + "\n";
									}
									
								}
							}
						}
						else{
							if(j % 2 == 0){
								if(greatestCommonFactor(i, j, k) == 1){
									if(j > i){
									output+= i + " " + j + " " + k + "\n";
									}
								}
							}
						}
					}
				}
			}
		}





		return output+"\n";
	}
}