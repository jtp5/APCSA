package Unit1;

import java.awt.Rectangle;
import java.util.Random;

public class Unit1Exercises {
	
	public static void main(String[] args) {
		
	}
	
	public void rollDie(){
		Random r = new Random();
		System.out.println("The die rolled a " + (r.nextInt(6) + 1));
	}
	
}
