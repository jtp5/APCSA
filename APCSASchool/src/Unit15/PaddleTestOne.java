package Unit15;


import static java.lang.System.*;
import java.awt.Color;

class PaddleTestOne
{
	public static void main( String args[] )
	{
		Paddle one = new Paddle();
		out.println(one);
		
		Paddle two = new Paddle(100,90, 10, 10, Color.RED, 5);
		out.println(two);
		
		Paddle three = new Paddle(100,100,30, 10, Color.RED, 5);
		out.println(three);
		
		Paddle four = new Paddle(100,100,30,50, Color.RED, 8);
		out.println(four);
		
		Paddle five = new Paddle(100,100,30,20, Color.GREEN,6);
		out.println(five);
		
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));										
	}
}