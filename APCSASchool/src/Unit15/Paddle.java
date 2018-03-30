package Unit15;


import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	super(10,10, 10, 70, Color.RED);
    speed = 5;
   }


   //add the other Paddle constructors

   public Paddle(int x, int y, int w, int h, Color c, int s){
	   super(x, y, w, h, c);
	   speed = s;
   }

   






   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY() + getSpeed());
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY() - getSpeed());
	   draw(window);

   }

   //add get methods
   
   public int getSpeed(){
	   return speed;
   }
   
   //add a toString() method
   public String toString(){
	   return "" + getX() + ", " + getY() + ", " + getWidth() + ", " + getHeight() + ", " + getColor() + getSpeed();
   }
}