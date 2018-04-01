package Unit15;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private int score1;
	private int score2;
	private boolean[] keys;
	private BufferedImage back;


	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball();
		leftPaddle = new Paddle(20, 350, 10, 70, Color.RED, 5);
		rightPaddle = new Paddle(770, 350, 10, 70, Color.RED, 5);
		score1 = 0;
		score2 = 0;


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
		if(ball.getX() >= 10 && ball.getX() <= 780) {
		ball.moveAndDraw(graphToBack);
		}
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.setColor(Color.BLACK);
		graphToBack.drawString("Player 1 Score: " + score1, 50, 550);
		graphToBack.drawString("Player 2 Score: " + score2, 650, 550);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10))
		{
			ball.erase(graphToBack);
			ball.setX(400);
			ball.setY(350);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Player 2 Score: " + score2, 650, 550);
			score2++;
		}
		
		if(!(ball.getX()<=780)){
			ball.erase(graphToBack);
			ball.setX(400);
			ball.setY(350);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("Player 1 Score: " + score1, 50, 550);
			score1++;
		}

		
		//see if the ball hits the top or bottom wall 

		if((ball.getY() <= 0 )){
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		if((ball.getY() >= 570)){
			ball.setYSpeed(-ball.getYSpeed());
		}


		//see if the ball hits the left paddle
		
		if((ball.getX() <= (leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())) && (ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() || ball.getY() + ball.getHeight() >= leftPaddle.getY() && ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()))){
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-ball.getYSpeed());
			}
			else{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		//see if the ball hits the right paddle
		
		if((ball.getX() >= (rightPaddle.getX())) && (ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight() || ball.getY() + ball.getHeight() >= rightPaddle.getY() && ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())){
			if(ball.getX() >= rightPaddle.getX() + rightPaddle.getWidth() - Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-ball.getYSpeed());
			}
			else{
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		


		//see if the paddles need to be moved

		if(keys[0] == true && leftPaddle.getY() >= 0)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true && leftPaddle.getY() <= 500)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
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