package Unit3;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 1;
		b = 2;
		c = 1;

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

 	}

	public void calcRoots( )
	{
		rootOne = (-b + Math.sqrt((b * b) + (-4 * a * c)))/(2 * a);
		rootTwo = (-b - Math.sqrt((b * b) + (-4 * a * c)))/(2 * a);

	}

	public void print( )
	{
		String output1 = String.format("%.2f", rootOne);
		String output2 = String.format("%.2f", rootTwo);
		System.out.println("The roots of the quadratic are " + output1 + " and " + output2);

	}
}