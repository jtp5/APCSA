package Unit11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the name of this class?");
		String name = keyboard.nextLine();

		System.out.println("How many students are in the class?");
		int stuCount = Integer.parseInt(keyboard.nextLine());

		Class raven = new Class(name, stuCount);
		
		String sName = "";
		String grades = "";
		
		for (int i = 0; i < stuCount; i++) {
			System.out.println("Enter the name of student " + (i + 1) + " : ");
			sName = keyboard.nextLine();
			System.out.println("Enter the grades of the student in the format (87.0 90.0 78.0 ) : ");
			grades = keyboard.nextLine();
			raven.addStudent(i, new Student(sName, grades));
		}

		out.println(raven);
		for (int i = 0; i < stuCount; i++) {
			out.println(String.format(raven.getStudentName(i) + "\'s average = %.2f",raven.getStudentAverage(i)));	
		}

		out.println("Failure List = " + raven.getFailureList(70));	
		out.println("Highest Average = " + raven.getStudentWithHighestAverage());
		out.println("Lowest Average = " + raven.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",raven.getClassAverage()));			










	}		
}