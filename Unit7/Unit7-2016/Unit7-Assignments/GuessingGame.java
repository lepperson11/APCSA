//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;


public class GuessingGame
{
	private int upperbound, guess,randomnumber, guesscount;
	Scanner keyboard = new Scanner(System.in);
	
	public void Guessing(int stop)
	{
		upperbound = stop;

	}

	public void playGame()
	{
		Random rand = new Random();
		guess = 0;
		guesscount = 0;
		randomnumber = rand.nextInt(upperbound) + 1;
		while (guess != randomnumber)
		{
			System.out.println("Pick a number between 1 and " + upperbound);
			guess = keyboard.nextInt();
			guesscount++;
		} 



	}

	public String toString()
	{
		String output="It took you " + guesscount + " guesses to guess " + randomnumber + "\n" + "You guessed wrong " + (100-(100/guesscount)) + " percent of the time.";

		return output;
	}
}