//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int evenCount, oddCount, num1, num2, total;
	
	public void setNumbers(int number1, int number2)
	{
		num1 = number1;
		num2 = number2;
	}
	public void getEvenCount()
	{
		evenCount = 0;
		for (int i = num1; i <= num2; i++)
		{
			if (i % 2 == 0)
			{
				evenCount = evenCount + 1;
			}
		}
	}

	public void getOddCount()
	{
		oddCount = 0;
		for (int i = num1; i <= num2; i++)
		{
			if (i % 2 != 0)
			{
				oddCount = oddCount + 1;
			}
		}
	}

	public void getTotal()
	{
		total = 0;
		for (int i = num1; i <= num2; i++)
		{
			total = total + i;
		}
	}
	
	public void print()
	{
		System.out.println(num1 + " " + num2);
		System.out.println("Total: " + total);
		System.out.println("Even Count: " + evenCount);
		System.out.println("Odd Count: " + oddCount);


	}
}