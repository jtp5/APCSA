package Unit11;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades {
	private Grade[] gradeList;

	// constructors
	
	public Grades(String values){
		setGrades(values);
	}
	
	public void setGrades(String values) {
		int num = 0;
		for (int i = 0; i < values.length(); i++) {
			if(values.charAt(i) == ' '){
				num += 1;
			}
		}
		int temp = 0;
		gradeList = new Grade[num];
		double[] gradeList2 = new double[num];
		for (int i = 0; i < num; i++) {
			gradeList2[i] = Double.parseDouble(values.substring(temp, values.indexOf(' ', temp) + 1));
			temp += values.substring(temp, values.indexOf(' ', temp)).length() + 1;
		}
		for (int i = 0; i < gradeList2.length; i++) {
			gradeList[i] = new Grade(gradeList2[i]);
		}
	}

	public void setGrade(int spot, double gr) {
		gradeList[spot] = new Grade(gr);
	}

	public double getSum() {
		double sum = 0;
		for (int i = 0; i < gradeList.length; i++) {
			sum += gradeList[i].getNumericGrade();
		}
		return sum;
	}

	public double getLowGrade() {
		double lowGrade = gradeList[0].getNumericGrade();
		for (int i = 0; i < gradeList.length; i++) {
			if(!(i == 0)){
				if(gradeList[i].getNumericGrade() < lowGrade){
					lowGrade = gradeList[i].getNumericGrade();
				}
			}
		}
		return lowGrade;
	}

	public double getHighGrade() {
		double highGrade = gradeList[0].getNumericGrade();
		for (int i = 0; i < gradeList.length; i++) {
			if(!(i == 0)){
				if(gradeList[i].getNumericGrade() > highGrade){
					highGrade = gradeList[i].getNumericGrade();
				}
			}
		}
		return highGrade;
	}

	public int getNumGrades() {
		return gradeList.length;
	}
	
	public Grade[] getGradeList(){
		return gradeList;
	}
	
	// toString method
	public String toString(){
		String output = "";
		for (int i = 0; i < gradeList.length; i++) {
			output += (gradeList[i].getNumericGrade() + " ");
		}
		return output;
	}
}