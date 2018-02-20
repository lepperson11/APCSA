//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence, lookFor, sentence2;

   public void setRemover(String s, String rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public void removeLetters()
	{
		sentence2 = sentence.replace(lookFor,"");
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "   " + sentence2;
	}
}