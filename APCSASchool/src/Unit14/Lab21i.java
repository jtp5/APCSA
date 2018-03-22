package Unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\Unit14\\lab21i.dat"));
		Maze test = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		for (int i = 0; i < 5; i++) {
			System.out.println(Arrays.toString(test.getMaze()[i]));
		}
		System.out.println(test);
		
		System.out.println("");
		
		Maze test2 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		for (int i = 0; i < 5; i++) {
			System.out.println(Arrays.toString(test2.getMaze()[i]));
		}
		System.out.println(test2);
		
		System.out.println("");
		
		Maze test3 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		for (int i = 0; i < 5; i++) {
			System.out.println(Arrays.toString(test3.getMaze()[i]));
		}
		System.out.println(test3);
		
		System.out.println("");
		
		Maze test4 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		for (int i = 0; i < 5; i++) {
			System.out.println(Arrays.toString(test4.getMaze()[i]));
		}
		System.out.println(test4);
	}
}