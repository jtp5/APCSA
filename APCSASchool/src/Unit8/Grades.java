package Unit8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	double[] gradeList = new double[1];
	

	//constructor
	public Grades(int x, String s) {
		setGrades(x, s);
	}


	//set method
	public void setGrades(int x, String s) {
		int temp = 0;
		double[] gradeList2 = new double[x];
		for (int i = 0; i < gradeList2.length; i++) {
			gradeList2[i] = Double.parseDouble(s.substring(temp, s.indexOf(' ', temp) + 1));
			temp += s.substring(temp, s.indexOf(' ', temp)).length() + 1;
		}
		gradeList = gradeList2;
	}


	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < gradeList.length; i++) {
			sum += gradeList[i];
		}


		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average += getSum();
		average = average/gradeList.length;


		return average;
	}


	//toString method
	public String toString() {
		String output = "";
		
		for (int i = 0; i < gradeList.length; i++) {
			output += ("grade " + i + " :: " + gradeList[i] + "\n");
		}
		
		return output;
	}



}