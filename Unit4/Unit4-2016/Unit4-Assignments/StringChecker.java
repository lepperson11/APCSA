//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	String word;

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		if(word.indexOf(c)!=-1)
		{
		   return true;
		}
		else
		{
		   return false;
		}
	}

	public boolean findSubString(String s)
	{
		if(word.indexOf(s)!=-1)
		{
		   return true;
		}
		else
		{
		   return false;
		}
	}

 	public void print()
 	{
 		 System.out.println(word);
	}
}