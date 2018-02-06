package Unit3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;
	}

	public Triangle(int a, int b, int c)
	{
		setSides(a,b,c);
	}


	public void setSides(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter( )
	{
		int perimeter = sideA + sideB + sideC;
		System.out.println(perimeter);
	}

	public void calcArea( )
	{
		double s;


	}

	public void print( )
	{


		System.out.println("\n\n");
	}
}