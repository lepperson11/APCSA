//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.regex.Pattern;


public class Name
{
	String name, first, second;
	
   public void setName(String s)
   {
	   name = s;
   }

	public void getFirst()
	{
		int test = name.indexOf(" ");
		first = name.substring(0, test);
	}

	public void getLast()
	{
		second = name.substring (name.lastIndexOf (' '), name.length());
	}

 	public void print()
 	{
 		System.out.println(first);
 		System.out.println(second);
 		System.out.println(name);

	}
}