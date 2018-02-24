package Unit8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{

		setRoman(str);

	}

	public RomanNumeral(Integer orig)
	{

		setNumber(orig);

	}

	public void setNumber(Integer num)
	{

		number = num;



	}

	public void setRoman(String rom)
	{

		roman = rom;

	}

	public Integer getNumber()
	{
		number = 0;
		for (int i = 0; i < roman.length(); i++) {
			if(roman.charAt(i) == 'I') {
				number++;
			}
			if(roman.charAt(i) == 'V') {
				number += 5;
			}
			if(roman.charAt(i) == 'X') {
				number += 10;
			}
			if(roman.charAt(i) == 'L') {
				number += 50;
			}
			if(roman.charAt(i) == 'C') {
				number += 100;
			}
			if(roman.charAt(i) == 'M') {
				number += 1000;
			}
		}
		
		if(roman.contains("IV")) {
			number -= 2;
		}
		if(roman.contains("IX")) {
			number -= 2;
		}
		if(roman.contains("XL")) {
			number -= 20;
		}
		if(roman.contains("XC")) {
			number -= 20;
		}
		if(roman.contains("CD")) {
			number -= 200;
		}
		if(roman.contains("CM")) {
			number -= 200;
		}
		
		return number;
	}

	public String toString()
	{
		roman = "";
		for (int i = 0; i < NUMBERS.length; i++) {
			while(number >= NUMBERS[i]) {
				roman += LETTERS[i];
				number -= NUMBERS[i];
			}
		}
		
		
		
		
		return roman + "\n";
	}
}