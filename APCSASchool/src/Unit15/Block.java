package Unit15;


import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y, int w, int h, Color c){
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	   color = col;

   }
   
   public void setWidth(int w){
	   width = w;
   }
   
   public void setHeight(int h){
	   height = h;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{

		Block test = new Block(getX(), getY(), getWidth(), getHeight(), getColor());
		
		if(test.toString().equals(obj.toString())){
			return true;
		}


		return false;
	}   

   //add the other get methods
    
	public Color getColor(){
		   return color;
	   }
	   
	   public int getWidth(){
		   return width;
	   }
	   
	   public int getHeight(){
		   return height;
	   }

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos = y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	}

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		return "" + getX() + ", " + getY() + ", " + getWidth() + ", " + getHeight() + ", " + getColor();
	}
}