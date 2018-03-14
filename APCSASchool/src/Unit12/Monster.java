package Unit12;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		setWeight(140);
		setHeight(6);
		setAge(16);
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		setWeight(140);
		setHeight(ht);
		setAge(16);
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		setWeight(wt);
		setHeight(ht);
		setAge(16);
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		setWeight(wt);
		setHeight(ht);
		setAge(age);
	}


	//modifiers - write set methods for height, weight, and age
	public void setWeight(int num){
		myWeight = num;
	}
	
	public void setHeight(int num){
		myHeight = num;
	}
	
	public void setAge(int num){
		myAge = num;
	}
	
	
	//accessors - write get methods for height, weight, and age
		public int getWeight(){
			return myWeight;
		}
		
		public int getHeight(){
			return myHeight;
		}
		
		public int getAge(){
			return myAge;
		}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(getHeight(), getWeight(), getAge());
	}

	public boolean equals( Object obj )
	{
		Monster c = (Monster)obj;
		if(getWeight() == c.getWeight()){
			return true;
		}

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;

		if(getWeight() > rhs.getWeight()){
			return 1;
		}

		if(getWeight() == rhs.getWeight()){
			return 0;
		}

		return -1;
	}

	//write a toString() method
	public String toString(){
		String output = "Weight - " + getWeight() + ", Height - " + getHeight() + ", Age - " + getAge();
		return output;
	}
	
}