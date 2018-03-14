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
	private ArrayList<Grade> gradeList;

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
		gradeList = new ArrayList<Grade>();
		ArrayList<Double> gradeList2 = new ArrayList<Double>();
		for (int i = 0; i < num; i++) {
			gradeList2.add(Double.parseDouble(values.substring(temp, values.indexOf(' ', temp) + 1)));
			temp += values.substring(temp, values.indexOf(' ', temp)).length() + 1;
		}
		for (int i = 0; i < gradeList2.size(); i++) {
			gradeList.add(new Grade(gradeList2.get(i)));
		}
	}

	public void setGrade(int spot, double gr) {
		gradeList.set(spot, new Grade(gr));
	}

	public double getSum() {
		double sum = 0;
		for (int i = 0; i < gradeList.size(); i++) {
			sum += gradeList.get(i).getNumericGrade();
		}
		return sum;
	}

	public double getLowGrade() {
		double lowGrade = gradeList.get(0).getNumericGrade();
		for (int i = 0; i < gradeList.size(); i++) {
			if(!(i == 0)){
				if(gradeList.get(i).getNumericGrade() < lowGrade){
					lowGrade = gradeList.get(i).getNumericGrade();
				}
			}
		}
		return lowGrade;
	}

	public double getHighGrade() {
		double highGrade = gradeList.get(0).getNumericGrade();
		for (int i = 0; i < gradeList.size(); i++) {
			if(!(i == 0)){
				if(gradeList.get(i).getNumericGrade() > highGrade){
					highGrade = gradeList.get(i).getNumericGrade();
				}
			}
		}
		return highGrade;
	}

	public int getNumGrades() {
		return gradeList.size();
	}
	
	public ArrayList<Grade> getGradeList(){
		return gradeList;
	}
	
	// toString method
	public String toString(){
		String output = "";
		for (int i = 0; i < gradeList.size(); i++) {
			output += (gradeList.get(i).getNumericGrade() + " ");
		}
		return output;
	}
}