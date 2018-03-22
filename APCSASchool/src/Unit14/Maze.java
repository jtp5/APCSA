package Unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
		maze = new int[][]{{1, 0, 0, 0, 0}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}};

	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		int track = 0;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				maze[i][j] = (int)(line.charAt(track)) - 48;
				track = track + 2;
			}
		}

	}

	public boolean hasExitPath(int r, int c)
	{
		int save = 0;
		if((r < maze.length && r > -1) && (c < maze[r].length && c > -1) && (maze[r][c] == 1)){
			save = maze[r][c];
			maze[r][c] = 2;
			hasExitPath(r - 1, c);
			hasExitPath(r + 1, c);
			hasExitPath(r, c - 1);
			hasExitPath(r, c + 1);
		}
		if(c == maze.length - 1){
			return true;
		}
		if((r < maze.length && r > -1) && (c < maze[r].length && c > -1)){
			maze[r][c] = save;
		}
		return false;
	}

	public int[][] getMaze(){
		return maze;
	}
	
	public String toString()
	{
		String output="";

		if(hasExitPath(0, 0)){
			output += "exit found";
		}
		else{
			output += "exit not found";
		}



		return output;
	}
}