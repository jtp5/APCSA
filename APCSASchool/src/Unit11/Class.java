package Unit11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList= new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum, s);

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		
		for (int i = 0; i < studentList.size(); i++) {
			classAverage += studentList.get(i).getAverage();
		}

		classAverage = classAverage/studentList.size();

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		double average = 0.0;
		
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getName().equals(stuName)){
				average = studentList.get(i).getAverage();
			}
		}

		return average;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";

		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getAverage() > high){
				high = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
		}




		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		

		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getAverage() < low){
				low = studentList.get(i).getAverage();
				hName = studentList.get(i).getName();
			}
		}




		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getAverage() <= failingGrade){
				output += (studentList.get(i).getName() + ", ");
			}
		}

		output += "are failing";

		return output;
	}
	
	public static ArrayList<Student> sortScores(ArrayList<Student> students) {
		ArrayList<Student> alist = new ArrayList<Student>();
		boolean swap = true;
		Student holder;
		for (Student s : students) {
			alist.add(s);
		}
		while (swap) {
			swap = false;
			for (int i = 1; i < alist.size(); i++) {
				if (alist.get(i - 1).compareTo(alist.get(i)) > 0) {
					holder = alist.get(i - 1);
					alist.set(i - 1, alist.get(i));
					alist.set(i, holder);
					swap = true;
				}
			}
		}

		return alist;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";




		return output;
	}  	
}