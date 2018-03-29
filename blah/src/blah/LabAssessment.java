package blah;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

public class LabAssessment 
{
	private static boolean bool;
	private static int nums;
	private ArrayList num1;
	public static boolean isGoofy(int num)
	{
		nums = num;
		if (num % 2 == 0 || num % 3 == 0)
		{
			if (num % 2 == 0)
			{
				return false;
			}
			if (num % 3 == 0)
			{
				return true;
			}
		}
		return false;
	}
	public static int getSomeGoofyNumbers(int count)
	{
		bool = isGoofy(12);
		if (bool = true)
		{
			return nums;
		}
		if (bool = false)
		{
			return nums;
		}
		return nums;
	}
	public String toString()
	{
		String output = "";
		output = "[" + getSomeGoofyNumbers(3) + "]";
		return output;
	}
}
