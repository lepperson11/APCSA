//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		if (number % 2 != 0 && number % 3 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		String output;
		if (isPrime() == true)
		{
			output = number + " is a prime number";
		}
		else
		{
			output = number + " is not a prime number";
		}
		return output;
	}
}