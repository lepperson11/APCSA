//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.Math.sqrt;

public class Quadratic
{
	Scanner keyboard = new Scanner(System.in);
	double a, b, c;
	double rootOne;
	double rootTwo;

	public void setEquation()
	{
		System.out.println("Enter A:");
		a = keyboard.nextDouble();

		System.out.println("Enter B:");
		b = keyboard.nextDouble();
		
		System.out.println("Enter C:");
		c = keyboard.nextDouble();
 	}

	public void calcRoots()
	{
		rootOne = (-b + sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
		rootTwo = (-b - sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);

	}

	public void print( )
	{
		System.out.println("rootone :" + rootOne);
		System.out.println("roottwo :" + rootTwo);

	}
}