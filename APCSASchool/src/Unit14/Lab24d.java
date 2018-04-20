package Unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File(System.getProperty("user.dir")+"\\src\\Unit14\\lab24d.dat"));

		TicTacToe[] test = new TicTacToe[Integer.parseInt(file.nextLine())];

		for (int i = 0; i < test.length; i++) {
			test[i] = new TicTacToe(file.nextLine());
		}

		System.out.println(test[2]);


	}
}



