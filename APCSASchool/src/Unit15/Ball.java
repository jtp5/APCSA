package Unit15;


import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(400, 350, 10,10, Color.BLACK);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS){
		super(x, y, w, h, c);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   
	public void setXSpeed(int x){
		xSpeed = x;
	}
	
	public void setYSpeed(int y){
		ySpeed = y;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.WHITE);

      setX(getX()+getXSpeed());
		//setY
      setY(getY()+getYSpeed());
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{

		Ball test = new Ball(getX(), getY(), getWidth(), getHeight(), getColor(), getXSpeed(), getYSpeed());
		
		if(obj.toString().equals(test.toString())){
			return true;
		}


		return false;
	}   

   //add the get methods
	
	public int getXSpeed(){
		return xSpeed;
	}
	
	public int getYSpeed(){
		return ySpeed;
	}
	
   //add a toString() method
	
	public String toString(){
		return "" + getX() + ", " + getY() + ", " + getWidth() + ", " + getHeight() + ", " + getColor() + ", " + getXSpeed() + ", " + getYSpeed();
	}
	
	
	
	
	
	
	
}