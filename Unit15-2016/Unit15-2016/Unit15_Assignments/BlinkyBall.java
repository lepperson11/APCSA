
import java.awt.Color;
import java.awt.Graphics;



class BlinkyBall extends Ball
{
	public BlinkyBall()
	{
		super();
	}
	public BlinkyBall(int x, int y)
	{
		super(x,y);
	}
	public BlinkyBall(int x, int y, int w, int h)
	{
		super(x,y,w,h);
	}
	public BlinkyBall(int x, int y, int w, int h, int xS, int yS)
	{
		super(x,y,w,h);
		setSpeed(xS,yS);
	}
	public BlinkyBall(int x, int y, int w, int h, Color c, int xS, int yS)
	{
		super(x,y,w,h,c,xS,yS);
	}
	
	public Color randomColor()
	{
		int a = (int)Math.floor(256 * Math.random());
		int b = (int)Math.floor(256 * Math.random());
		int c = (int)Math.floor(256 * Math.random());
		return new Color(a,b,c);
	}
	
	public void moveAndDraw(Graphics window)
	{
		draw(window,Color.white);
		setX(getX() + getXSpeed());
		setY(getY() + getYSpeed());
		setColor(randomColor());
		draw(window);
	}
}
