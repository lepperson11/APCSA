//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private double xOne,yOne, xTwo, yTwo;
	private double slope;
	String cord1, cord2;
	
	public Line(double x1, double y1, double x2, double y2)
	{

		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;



	}

	public void setCoordinates()
	{
		cord1 = xOne + "," + yOne;
		cord2 = xTwo + "," + yTwo;




	}

	public void calculateSlope( )
	{
		slope = (yTwo - yOne)/(xTwo - xOne);

	}

	public void print( )
	{
		System.out.println("The cordinates are (" + cord1 + ") (" + cord2 + ")");
		System.out.println("The slope is:" + slope);

	}
}