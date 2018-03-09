package Unit11;

public class Grade {
	private double value;
	// add in two constructors
	public Grade(){
		setValue(0.0);
	}
	public Grade(double num){
		setValue(num);
	}
	// add in set and get methods
	public void setValue(double num){
		value = num;
	}
	 String getLetterGrade(){
		 if(value >= 90){
			 return "A";
		 }
		 if(value >= 80){
			 return "B";
		 }
		 if(value >= 70){
			 return "C";
		 }
		 if(value >= 60){
			 return "D";
		 }
		 return "F";
	 }
	 double getNumericGrade(){
		 return value;
	 }
//	 toString method
	 public String toString(){
		 return "The grade is " + getNumericGrade() + " which is a(n) " + getLetterGrade();
	 }
}