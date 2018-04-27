package Unit17;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private boolean alive;

	public Alien()
	{
		this(0,0,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,0);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		setAlive(true);
		try
		{
			image = ImageIO.read(new File("src//Unit17//alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Image file not found");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),80,80,null);
	}
	
	public void setAlive(boolean x){
		alive = x;
	}
	
	public boolean isAlive(){
		return alive;
	}

	public String toString()
	{
		return "";
	}
}
