//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	private String upper, lower, number;
	int ascii;

	public CharacterAnalyzer(char c)
	{
		theChar = c;

	}

	public void isUpper( )
	{
		if (theChar>='A' && theChar<='Z')
		{
			upper = "It is uppercase.";
			ascii = theChar;
			System.out.println(upper + " and the ASCII value is " + ascii);
		}
	}

	public void isLower( )
	{
		if (theChar>='a' && theChar<='z')
		{
			lower = "It is lowercase.";
			ascii = theChar;
			System.out.println(lower  + " and the ASCII value is " + ascii);
		}
	}
	
	public void isNumber( )
	{
		
		if (theChar>='0' && theChar<= '9')
		{
			number = "It is a number.";
			ascii = theChar;
			System.out.println(number  + " and the ASCII value is " + ascii);
		}
	}	
}