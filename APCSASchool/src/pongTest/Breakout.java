package pongTest;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;

import Unit15.Ball;
import Unit15.Block;
import Unit15.Paddle;

import java.awt.event.ActionListener;

public class Breakout extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle rightPaddle;
	private int score1;
	private int score2;
	private Block[][] blocks = new Block[5][4];
	private boolean[] keys;
	private BufferedImage back;


	public Breakout()
	{
		//set up all variables related to the game
		System.out.println("Jones Pearlman\nPeriod 4\nComputer #: 40");
		ball = new Ball();
		rightPaddle = new Paddle(770, 350, 10, 70, Color.RED, 5);
		score1 = 0;
		for (int i = 0; i < blocks.length; i++) {
			for (int j = 0; j < blocks[i].length; j++) {
			blocks[i][j] = new Block(15*j + 5, 125*i + 5, 10, 115, Color.GREEN);	
			}
		}


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.WHITE);
		if(ball.getX() >= -5 && ball.getX() <= 810) {
		ball.moveAndDraw(graphToBack);
		}
		rightPaddle.draw(graphToBack);
		drawBlocks(graphToBack);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Score: " + score1, 250, 550);


		//see if ball hits left wall or right wall
//		if(!(ball.getX()>=10))
//		{
//			ball.setXSpeed(-ball.getXSpeed());
//		}
		
		if(!(ball.getX()<=780)){
			//ball.erase(graphToBack);
			ball.moveAndDraw(graphToBack);
			ball.setX(400);
			ball.setY(350);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Score: " + score1, 250, 550);
			score1 = 0;
			for (int i = 0; i < blocks.length; i++) {
				for (int j = 0; j < blocks[i].length; j++) {
					blocks[i][j].setColor(Color.GREEN);
				}
			}
		}

		
		//see if the ball hits the top or bottom wall 

		if((ball.getY() <= 0 )){
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if((ball.getY() >= 570)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if((ball.getX() <= 0)){
			ball.setXSpeed(-ball.getXSpeed());
		}


		//see if the ball hits the left paddle
		
		//see if the ball hits the right paddle
		
		if(ball.didCollideRight(rightPaddle)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		for (int i = 0; i < blocks.length; i++) {
			for (int j = 0; j < blocks[i].length; j++) {
				if(!(blocks[i][j].getColor().equals(Color.WHITE))){
					if(ball.didCollideLeft(blocks[i][j])){
						blocks[i][j].setColor(Color.WHITE);
						graphToBack.setColor(Color.WHITE);
						graphToBack.drawString("Score: " + score1, 250, 550);
						score1++;
						ball.setXSpeed(-ball.getXSpeed());
					}
				}
			}
		}

		//see if the paddles need to be moved

		
		if(keys[2] == true && rightPaddle.getY() >= 0)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true && rightPaddle.getY() <= 500)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
	













		
		twoDGraph.drawImage(back, null, 0, 0);
	}
   
   public void drawBlocks(Graphics window){
	   for (int i = 0; i < blocks.length; i++) {
		for (int j = 0; j < blocks[i].length; j++) {
			blocks[i][j].draw(window);
		}
	}
   }

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}