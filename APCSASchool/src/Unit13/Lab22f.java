package Unit13;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

public class Lab22f
{
	public static void main(String args[])
	{
		Comparable[] test = new Comparable[]{9,5,3,2};
		
		QuickSort.quickSort(test);

		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}

		QuickSort.quickSort(new Comparable[]{19,52,3,2,7,21});


		QuickSort.quickSort(new Comparable[]{68,66,11,2,42,31});
	}
}


