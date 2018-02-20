package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guessing game - How many numbers?");
		GuessingGame test = new GuessingGame(keyboard.nextInt());
		test.playGame();




	}
}