package Unit17;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

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
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo a;
	private Aliens aliens;
	
	private ArrayList<Alien> aliensList;
	private ArrayList<Ammo> shots;
	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(300, 300, 2);
		shots = new ArrayList<Ammo>();
		//a = new Ammo(ship.getX(), ship.getY(), 5);
		alienOne = new Alien(200, 150, 2);
		alienTwo = new Alien(400, 150, 2);
		aliensList = new ArrayList<Alien>();
		aliensList.add(alienOne);
		aliensList.add(alienTwo);
		aliens = new Aliens();
		aliens.add(alienOne);
		aliens.add(alienTwo);
		//instantiate other stuff

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
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
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		ship.draw(graphToBack);
		aliens.draw(graphToBack);
		
		if(alienOne.getX() < 100){
			alienOne.setSpeed(-alienOne.getSpeed());
		}
		
		if(alienTwo.getX() < 300){
			alienTwo.setSpeed(-alienTwo.getSpeed());
		}
		
		if(alienOne.getX() > 300){
			alienOne.setSpeed(-alienOne.getSpeed());
		}
		
		if(alienTwo.getX() > 500){
			alienTwo.setSpeed(-alienTwo.getSpeed());
		}
		
		alienOne.move("LEFT");
		alienTwo.move("LEFT");

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move stuff
		if(keys[1] == true){
			ship.move("RIGHT");
		}
		
		if(keys[2] == true){
			ship.move("UP");
		}
		
		if(keys[3] == true){
			ship.move("DOWN");
		}
		
		if(keys[4] == true && shots.size() < 2){
			shots.add(new Ammo(ship.getX(), ship.getY(), 5));
			shots.get(shots.size() - 1).setPos(ship.getX() + 35, ship.getY());
		}
		
		for(int i = 0; i < shots.size(); i++){
			shots.get(i).draw(graphToBack);
			shots.get(i).move("UP");
		}
		
		for (int i = 0; i < shots.size(); i++) {
			if(shots.get(i).getY() < 20){
				shots.remove(i);
			}
		}

		//add in collision detection
		for(Ammo a : shots){
			for (int i = 0; i < aliens.getList().size(); i++) {
				if(a.getX() >= aliens.getList().get(i).getX() && a.getX() <= aliens.getList().get(i).getX() + 200 && a.getY() >= aliens.getList().get(i).getY() && a.getY() <= aliens.getList().get(i).getY() + 175){
					aliens.getList().remove(aliens.getList().get(i));
				}
			}
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

