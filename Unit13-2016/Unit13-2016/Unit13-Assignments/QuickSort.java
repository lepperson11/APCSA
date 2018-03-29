//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		



	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		int split;
		while (low < high){
			split = partition(list, low, high);
			quicksort(list, low, split);
			quicksort(list, split + 1, high);
		}






	}


	private static int partition(Comparable[] list, int low, int high)
	{
		int pivot = 1;
		int bot = pivot - 1;
		int top = pivot + 1;
		while (bot < top)
		{
			
		}
		return 0;
	}
}