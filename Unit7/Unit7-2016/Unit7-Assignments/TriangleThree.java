//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size, size2, size3;
   private String letter;

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		size2 = 0;
		String output = "";
		size3 = size;
		while (size >= 1)
		{
			size2++;
			output = output + " ";
			for (size3 = 1; size3 <= size2; size3 = size3 + 1)
			{
				
				output = output + letter;
				
			}
			output = output + "\n";
			size3 = size3 - 2;
			size = size - 1;
		}
		return output;
	}
}