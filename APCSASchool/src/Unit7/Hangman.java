package Unit7;

import java.util.Random;
import java.util.Scanner;

public class Hangman{
	  private String[] words = {"ravens", "baseball", "fortnite", "chicken", "weekend"};
	  Random r = new Random();
	  Scanner keyboard = new Scanner(System.in);
	  
	  public void ball(){
	    String answer = words[r.nextInt(5)];
	    String holder1 = "";
	    String holder2 ="";
	    char guess;
	    for(int a = 0; a < answer.length(); a++){
	      holder1 += "*";
	    }
	    while(!(holder1.equals(answer))){
	      System.out.println("Guess a letter in the word " + holder1 + " > ");
	      guess = keyboard.next().charAt(0);
	      for(int i = 0; i < answer.length(); i ++){
	        if(guess == answer.charAt(i)){
	        	holder2 = holder1;
	        	holder1 = "";
	          for(int j = 0; j < holder2.length(); j++){
	            if(holder2.charAt(j) == '*' && !(j == i)){
	            	holder1 += '*';
	            }
	            else if(j == i){
	            	holder1 += guess;
	            }
	            else{
	            	holder1 += holder2.charAt(j);
	            }
	          }
	        }
	      }
	      System.out.println(holder1);
	    }
	  }
	}