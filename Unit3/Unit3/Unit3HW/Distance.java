//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	double xOne,yOne,xTwo,yTwo;
	double distance;
	Scanner keyboard = new Scanner(System.in);


	public void setCoordinates()
	{

		System.out.println("Enter xOne:");
		xOne = keyboard.nextDouble();

		System.out.println("Enter yOne:");
		yOne = keyboard.nextDouble();
		
		System.out.println("Enter xTwo:");
		xTwo = keyboard.nextDouble();
		
		System.out.println("Enter yTwo:");
		yTwo = keyboard.nextDouble();

	}

	public void calcDistance()
	{

		distance = sqrt(Math.pow((xTwo - xOne),2) + Math.pow((yTwo - yOne),2));

	}

	public void print( )
	{

		System.out.println("The distance is :" + distance);

	}
}