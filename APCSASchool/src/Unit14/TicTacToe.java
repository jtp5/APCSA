package Unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat = new char[3][3];

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{

		for (int i = 0; i < mat.length; i++) {
			mat[0][i] = game.charAt(i);
		}
		for (int i = 0; i < mat.length; i++) {
			mat[1][i] = game.charAt(i + 3);
		}
		for (int i = 0; i < mat.length; i++) {
			mat[2][i] = game.charAt(i + 6);
		}


	}

	public String getWinner()
	{
		int hXCount = 0;
		int hOCount = 0;
		int vXCount = 0;
		int vOCount = 0;
		int dlXCount = 0;
		int dlOCount = 0;
		int drXCount = 0;
		int drOCount = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < 3; j++) {
				if(mat[i][j] == 'X') {
					hXCount++;
				}
				else if(mat[i][j] == 'O') {
					hOCount++;
				}
			}
			if(hXCount >= 3 || hOCount >= 3) {
				break;
			}
			hXCount = 0;
			hOCount = 0;
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < 3; j++) {
				if(mat[j][i] == 'X') {
					vXCount++;
				}
				else if(mat[j][i] == 'O') {
					vOCount++;
				}
			}
			if(vXCount >= 3 || vOCount >= 3) {
				break;
			}
			vXCount = 0;
			vOCount = 0;
		}
		
		for (int i = 0; i < mat.length; i++) {
			if(mat[i][i] == 'X') {
				dlXCount++;
			}
			else if(mat[i][i] == 'O') {
				dlOCount++;
			}
		}
		
		for (int i = mat.length - 1; i > 0; i--) {
			if(mat[i][i] == 'X') {
				drXCount++;
			}
			else if(mat[i][i] == 'O') {
				drOCount++;
			}
		}
		
		if(hXCount == 3) {
			return "X wins horizontally!";
		}
		else if(hOCount == 3) {
			return "O wins horizontally!";
		}
		if(vXCount == 3) {
			return "X wins vertically!";
		}
		else if(vOCount == 3) {
			return "O wins vertically!";
		}
		if(dlXCount == 3) {
			return "X wins diagonally!";
		}
		else if(dlOCount == 3) {
			return "O wins diagonally!";
		}
		else {
			return "cat's game - no winner!";
		}








	}

	public String toString()
	{
		String output="";

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				output += mat[i][j] + " ";
			}
			output += "\n";
		}

		output += getWinner();


		return output+"\n\n";
	}
}