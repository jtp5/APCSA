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
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ship extends MovingThing {
	private int speed;
	private Image image;
	private boolean shield;

	public Ship() {
		this(0, 0, 0);
	}

	public Ship(int x, int y) {
		this(x, y, 0);
	}

	public Ship(int x, int y, int s) {
		super(x, y);
		speed = s;
		setShield(false);
		try {
			image = ImageIO.read(new File("src//Unit17//ship.jpg"));
		} catch (Exception e) {
			System.out.println("Image file not found");
		}
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		if (shield) {
			try {
				image = ImageIO.read(new File("src\\Unit17\\shipWithShield.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Image file not found");
			}
		}
		window.drawImage(image, getX(), getY(), 80, 80, null);
	}

	public void setShield(boolean x) {
		shield = x;
	}

	public boolean hasShield() {
		return shield;
	}

	public String toString() {
		return super.toString() + getSpeed();
	}
}
