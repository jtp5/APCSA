package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	Random r = new Random();
	
	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		int answer = r.nextInt(upperBound) + 1;
		double guesses = 0.0;
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < upperBound; i++) {
			System.out.println("Enter a number between 1 and " + upperBound);
			if(keyboard.nextInt() == answer){
				guesses++;
				break;
			}
			guesses++;
		}

		System.out.println("It took you " + (int)guesses + " guesses to guess " + answer);
		System.out.println("You got it wrong " + (int)(((guesses - 1)/(guesses))*(100)) + "% of the time");


	}

	public String toString()
	{
		String output="";
		return output;
	}
}