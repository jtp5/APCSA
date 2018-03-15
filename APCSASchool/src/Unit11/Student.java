package Unit11;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);

	}
	
	public void setName(String name)
	{
		myName = name;

	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return (getSum() / getNumGrades());
	}

	public double getAverageMinusLow()
	{
		return ((getSum() - myGrades.getLowGrade()) / (getNumGrades() - 1));
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		String output = myName + " = ";
		for (int i = 0; i < myGrades.getGradeList().size(); i++) {
			output += myGrades.getGradeList().get(i).getNumericGrade() + " ";
		}
		return output;
	}
	
	public boolean equals( Object obj )
	{
		Student rhs = (Student)obj;
		if(this.getAverage()==rhs.getAverage()){
			return true;		
		}

		return false;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student other = (Student)o;
		return (int)(this.getAverage() - other.getAverage());
	}	
}