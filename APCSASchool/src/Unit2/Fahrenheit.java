package Unit2;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = (fahrenheit - 32) * (5.0/9);
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(fahrenheit + " degrees fahrenheit is equal to " + getCelsius() + " degrees celsius");
	}
}