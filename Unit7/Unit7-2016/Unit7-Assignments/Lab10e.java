//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		GuessingGame test = new GuessingGame();
		
		System.out.println("Guessing game - How many numbers?");
		int number = keyboard.nextInt();
		test.Guessing(number);
		test.playGame();
		System.out.println(test);


	}
}