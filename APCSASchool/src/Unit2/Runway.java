package Unit2;

import java.util.Scanner;

public class Runway {
	Scanner keyboard = new Scanner(System.in);
	private double a;
	private double v;
	private double length;
	
	public Runway(String accel, String vel){
		a = Double.parseDouble(accel);
		v = Double.parseDouble(vel);
	}
	
	public double calcLength(){
		length = (v*v)/(a*2);
		return length;
	}
	
	
}
