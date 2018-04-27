package Unit17;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Alien alienThree;
	private Alien alienFour;
	private Alien alienFive;
	private Alien alienSix;
	private Ammo a;
	private Aliens aliens;
	private Aliens aliens2;
	private Image image;
	
	private ArrayList<Alien> aliensList;
	private ArrayList<Ammo> shots;
	private ArrayList<Ammo> alienShots;
	private ArrayList<Ammo> alienShots2;
	private ArrayList<Ammo> alienShots3;
	private ArrayList<Ammo> alienShots4;
	private ArrayList<Ammo> alienShots5;
	private ArrayList<Ammo> alienShots6;
	

	private boolean[] keys;
	private BufferedImage back;
	private double score;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(300, 300, 2);
		shots = new ArrayList<Ammo>();
		alienShots = new ArrayList<Ammo>();
		alienShots2 = new ArrayList<Ammo>();
		alienShots3 = new ArrayList<Ammo>();
		alienShots4 = new ArrayList<Ammo>();
		alienShots5 = new ArrayList<Ammo>();
		alienShots6 = new ArrayList<Ammo>();
		//a = new Ammo(ship.getX(), ship.getY(), 5);
		alienOne = new Alien(200, 150, 2);
		alienTwo = new Alien(400, 150, 2);
		alienThree = new Alien(600, 150, 2);
		alienFour = new Alien(200, 250, 2);
		alienFive = new Alien(400, 250, 2);
		alienSix = new Alien(600, 250, 2);
		aliensList = new ArrayList<Alien>();
		aliensList.add(alienOne);
		aliensList.add(alienTwo);
		aliensList.add(alienThree);
		aliens = new Aliens();
		aliens.add(alienOne);
		aliens.add(alienTwo);
		aliens.add(alienThree);
		aliens2 = new Aliens();
		aliens2.add(alienFour);
		aliens2.add(alienFive);
		aliens2.add(alienSix);
		//instantiate other stuff
		score = 0;
		
		try {
			image = ImageIO.read(new File("src//Unit17//pu.jpg"));
		} catch (Exception e) {
			System.out.println("Image file not found");
		}

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
		graphToBack.drawString("Score: " + score, 725, 525);
		if(!(ship.hasShield())){
			graphToBack.drawImage(image, 375, 10, 80, 80, null);
		}
		ship.draw(graphToBack);
		aliens.draw(graphToBack);
		aliens2.draw(graphToBack);
		
		if(alienOne.getX() < 100){
			alienOne.setSpeed(-alienOne.getSpeed());
		}
		
		if(alienTwo.getX() < 300){
			alienTwo.setSpeed(-alienTwo.getSpeed());
		}
		
		if(alienThree.getX() < 500 ){
			alienThree.setSpeed(-alienThree.getSpeed());
		}
		
		if(alienOne.getX() > 300){
			alienOne.setSpeed(-alienOne.getSpeed());
		}
		
		if(alienTwo.getX() > 500){
			alienTwo.setSpeed(-alienTwo.getSpeed());
		}
		
		if(alienThree.getX() > 700 ){
			alienThree.setSpeed(-alienThree.getSpeed());
		}
		
		if(alienFour.getX() < 100){
			alienFour.setSpeed(-alienFour.getSpeed());
		}
		
		if(alienFive.getX() < 300){
			alienFive.setSpeed(-alienFive.getSpeed());
		}
		
		if(alienSix.getX() < 500 ){
			alienSix.setSpeed(-alienSix.getSpeed());
		}
		
		if(alienFour.getX() > 300){
			alienFour.setSpeed(-alienFour.getSpeed());
		}
		
		if(alienFive.getX() > 500){
			alienFive.setSpeed(-alienFive.getSpeed());
		}
		
		if(alienSix.getX() > 700 ){
			alienSix.setSpeed(-alienSix.getSpeed());
		}
		
		alienOne.move("LEFT");
		alienTwo.move("LEFT");
		alienThree.move("LEFT");
		alienFour.move("RIGHT");
		alienFive.move("RIGHT");
		alienSix.move("RIGHT");

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
					aliens.getList().get(i).setAlive(false);
					aliens.getList().remove(aliens.getList().get(i));
					score++;
				}
			}
		}
		
		for(Ammo a : shots){
			for (int i = 0; i < aliens2.getList().size(); i++) {
				if(a.getX() >= aliens2.getList().get(i).getX() && a.getX() <= aliens2.getList().get(i).getX() + 200 && a.getY() >= aliens2.getList().get(i).getY() && a.getY() <= aliens2.getList().get(i).getY() + 175){
					aliens2.getList().get(i).setAlive(false);
					aliens2.getList().remove(aliens2.getList().get(i));
					score++;
				}
			}
		}
		
		if(alienOne.isAlive() && alienShots.size() < 2){
			alienShots.add(new Ammo(alienOne.getX(), alienOne.getY(), 5));
			alienShots.get(alienShots.size() - 1).setPos(alienOne.getX() + 35, alienOne.getY());
		}
		
		for(int i = 0; i < alienShots.size(); i++){
			alienShots.get(i).draw(graphToBack);
			alienShots.get(i).move("DOWN");
		}
		
		for (int i = 0; i < alienShots.size(); i++) {
			if(alienShots.get(i).getY() > 590){
				alienShots.remove(i);
			}
		}

		//add in collision detection
		for(Ammo a : alienShots){
				if(a.getX() >= ship.getX() && a.getX() <= ship.getX() + 200 && a.getY() == ship.getY() && score > 0 && !(ship.hasShield())){
					score -= .5;
				}
		}
		
		if(alienTwo.isAlive() && alienShots2.size() < 2){
			alienShots2.add(new Ammo(alienTwo.getX(), alienTwo.getY(), 5));
			alienShots2.get(alienShots2.size() - 1).setPos(alienTwo.getX() + 35, alienTwo.getY());
		}
		
		for(int i = 0; i < alienShots2.size(); i++){
			alienShots2.get(i).draw(graphToBack);
			alienShots2.get(i).move("DOWN");
		}
		
		for (int i = 0; i < alienShots2.size(); i++) {
			if(alienShots2.get(i).getY() > 590){
				alienShots2.remove(i);
			}
		}

		//add in collision detection
		for(Ammo a : alienShots2){
				if(a.getX() >= ship.getX() && a.getX() <= ship.getX() + 200 && a.getY() == ship.getY() && score > 0 && !(ship.hasShield())){
					score -= .5;
				}
		}
		
		if(alienThree.isAlive() && alienShots3.size() < 2){
			alienShots3.add(new Ammo(alienThree.getX(), alienThree.getY(), 5));
			alienShots3.get(alienShots3.size() - 1).setPos(alienThree.getX() + 35, alienThree.getY());
		}
		
		for(int i = 0; i < alienShots3.size(); i++){
			alienShots3.get(i).draw(graphToBack);
			alienShots3.get(i).move("DOWN");
		}
		
		for (int i = 0; i < alienShots3.size(); i++) {
			if(alienShots3.get(i).getY() > 590){
				alienShots3.remove(i);
			}
		}

		//add in collision detection
		for(Ammo a : alienShots3){
				if(a.getX() >= ship.getX() && a.getX() <= ship.getX() + 200 && a.getY() == ship.getY() && score > 0 && !(ship.hasShield())){
					score -= .5;
				}
		}
		
		if(alienFour.isAlive() && alienShots4.size() < 2){
			alienShots4.add(new Ammo(alienFour.getX(), alienFour.getY(), 5));
			alienShots4.get(alienShots4.size() - 1).setPos(alienFour.getX() + 35, alienFour.getY());
		}
		
		for(int i = 0; i < alienShots4.size(); i++){
			alienShots4.get(i).draw(graphToBack);
			alienShots4.get(i).move("DOWN");
		}
		
		for (int i = 0; i < alienShots4.size(); i++) {
			if(alienShots4.get(i).getY() > 590){
				alienShots4.remove(i);
			}
		}

		//add in collision detection
		for(Ammo a : alienShots4){
				if(a.getX() >= ship.getX() && a.getX() <= ship.getX() + 200 && a.getY() == ship.getY() && score > 0 && !(ship.hasShield())){
					score -= .5;
				}
		}
		
		if(alienFive.isAlive() && alienShots5.size() < 2){
			alienShots5.add(new Ammo(alienFive.getX(), alienFive.getY(), 5));
			alienShots5.get(alienShots5.size() - 1).setPos(alienFive.getX() + 35, alienFive.getY());
		}
		
		for(int i = 0; i < alienShots5.size(); i++){
			alienShots5.get(i).draw(graphToBack);
			alienShots5.get(i).move("DOWN");
		}
		
		for (int i = 0; i < alienShots5.size(); i++) {
			if(alienShots5.get(i).getY() > 590){
				alienShots5.remove(i);
			}
		}

		//add in collision detection
		for(Ammo a : alienShots5){
				if(a.getX() >= ship.getX() && a.getX() <= ship.getX() + 200 && a.getY() == ship.getY() && score > 0 && !(ship.hasShield())){
					score -= .5;
				}
		}
		
		if(alienSix.isAlive() && alienShots6.size() < 2){
			alienShots6.add(new Ammo(alienSix.getX(), alienSix.getY(), 5));
			alienShots6.get(alienShots6.size() - 1).setPos(alienSix.getX() + 35, alienSix.getY());
		}
		
		for(int i = 0; i < alienShots6.size(); i++){
			alienShots6.get(i).draw(graphToBack);
			alienShots6.get(i).move("DOWN");
		}
		
		for (int i = 0; i < alienShots6.size(); i++) {
			if(alienShots6.get(i).getY() > 590){
				alienShots6.remove(i);
			}
		}

		//add in collision detection
		for(Ammo a : alienShots6){
				if(a.getX() >= ship.getX() && a.getX() <= ship.getX() + 200 && a.getY() >= ship.getY() && a.getY() <= ship.getY() + 80 && score > 0 && !(ship.hasShield())){
					System.out.println("test");
					score -= .5;
				}
		}
		
		if(ship.getX() >= 375 - 80 && ship.getX() <= 375 + 80 && ship.getY() >= 10 && ship.getY() <= 90){
			ship.setShield(true);
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

