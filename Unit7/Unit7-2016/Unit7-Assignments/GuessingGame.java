//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;


public class GuessingGame
{
	private int upperbound, guess;
	Scanner keyboard = new Scanner(System.in);
	
	public void Guessing(int stop)
	{
		upperbound = stop;

	}

	public void playGame()
	{
		Random rand = new Random();

		int n = rand.nextInt(upperbound) + 1;
		System.out.println("Pick a number between 1 and " + upperbound);
		int guess = keyboard.nextInt();




	}

	public String toString()
	{
		String output="";
		return output;
	}
}