//© A+ Computer Science  -  www.apluscompsci.com
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
	public String toString()
	{
		size2 = size;
		String output = "";
		size3 = size;
		while (size2 != 0)
		{
			for (size3 = size2; size3 <= size; size3 = size3 + 1)
			{
				
				output = output + letter;
				
			}
			output = output + "\n";
			size2--;
		}
		return output;
	}
}