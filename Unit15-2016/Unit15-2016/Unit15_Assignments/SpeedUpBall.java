
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{
	public SpeedUpBall()
	{
		super();
	}
	public SpeedUpBall(int x, int y)
	{
		super(x,y);
	}
	public SpeedUpBall(int x, int y, int xS, int yS)
	{
		super(x,y);
		setSpeed(xS,yS);
	}
	public SpeedUpBall(int x, int y, int w, int h, int xS, int yS)
	{
		super(x,y,w,h);
		setSpeed(xS,yS);
	}
	public SpeedUpBall(int x, int y, int w, int h, Color c, int xS, int yS)
	{
		super(x,y,w,h,c,xS,yS);
	}
	
	public boolean didCollide(Object obj)
	{
		if (didCollideLeft(obj) || didCollideRight(obj) || didCollideTop(obj) || didCollideBottom(obj))
		{
			setSpeed(2 * getXSpeed(),2 * getYSpeed());
			return true;
		}
		return false;
	}
}
