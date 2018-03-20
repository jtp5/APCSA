package Unit13;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort {
	private ArrayList<String> list = new ArrayList<String>();

	public InsertionSort() {

	}

	// modfiers
	public void add(String word) {
		int loc = 0;
		if (Math.abs(Collections.binarySearch(list, word)) - 1 <= list.size() - 1) {
			list.add(Math.abs(Collections.binarySearch(list, word)) - 1, word);
		}
		else if(Collections.binarySearch(list, word) < 0){
			list.add(word);
		}
	}

	public void remove(String word) {

		if (Collections.binarySearch(list, word) >= 0) {
			list.remove(Collections.binarySearch(list, word));
		}

	}

	public String toString() {
		String output = "";
		for(String s : list){
			output += (s + "\n");
		}
		return output;
	}
}