import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block


{
	private int xSpeed;
	private int ySpeed;
	private final int DEFAULT_X_SPEED = 3;
	private final int DEFAULT_Y_SPEED = 1;
	
	public Ball()
	{
		super(200,200);
		setSpeed(DEFAULT_X_SPEED,DEFAULT_Y_SPEED);
	}


	public Ball(int x, int y)
	{
		super(x,y);
		setSpeed(DEFAULT_X_SPEED,DEFAULT_Y_SPEED);
	}

	public Ball(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		setSpeed(DEFAULT_X_SPEED,DEFAULT_Y_SPEED);
	}

	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y,w,h,c);
		setSpeed(DEFAULT_X_SPEED,DEFAULT_Y_SPEED);
	}

	public Ball(int x, int y, int w, int h, Color c, int xS, int yS)
	{
		super(x,y,w,h,c);
		setSpeed(xS,yS);
	}

	public void setXSpeed(int xS)
	{
		xSpeed = xS;
	}

	public void setYSpeed(int yS)
	{
		ySpeed = yS;
	}

	public void setSpeed(int xS, int yS)
	{
		setXSpeed(xS);
		setYSpeed(yS);
	}

	public void moveAndDraw(Graphics window)
	{
		draw(window,Color.white);
		setX(getX() + getXSpeed());
		setY(getY() + getYSpeed());
		draw(window);
	}

	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}

	public boolean didCollideLeft(Object obj)
	{
		Block comp = (Block)obj;
		return (getX() <= comp.getX() + comp.getWidth() && getX() > comp.getX() && getY() >= comp.getY() && getY() <= comp.getY() + comp.getHeight());
	}

	public boolean didCollideRight(Object obj)
	{
		Block comp = (Block)obj;
		return (getX() + getWidth() >= comp.getX() - Math.abs(getXSpeed()) && getX() < comp.getX() && getY() >= comp.getY() && getY() <= comp.getY() + comp.getHeight());
	}

	public boolean didCollideTop(Object obj)
	{
		Block comp = (Block)obj;
		return (getX() >= comp.getX() && comp.getX() + comp.getWidth() >= getX() + getWidth() && getY() + getHeight() >= comp.getY() - Math.abs(getYSpeed()) && getY() < comp.getY() + comp.getHeight());
	}
	
	public boolean didCollideBottom(Object obj)
	{
		Block comp = (Block)obj;
		return (getX() >= comp.getX() && comp.getX() + comp.getWidth() >= getX() + getWidth() && getY() + getHeight() > comp.getY() - Math.abs(getYSpeed()) && getY() - Math.abs(getYSpeed()) <= comp.getY() + comp.getHeight());
	}

	public boolean didCollide(Object obj)
	{
		return didCollideLeft(obj) || didCollideRight(obj) || didCollideTop(obj) || didCollideBottom(obj);
	}

	public boolean equals(Object obj)
	{
		if (!super.equals(obj)) return false;
		Ball comp = (Ball)obj;
		if (getXSpeed() != comp.getXSpeed()) return false;
		if (getYSpeed() != comp.getYSpeed()) return false;
		return true;
	}
	
	public String toString()
	{
		String word = super.toString();
		word += " ";
		word += getXSpeed();
		word += " ";
		word += getYSpeed();
		return word;
	}
}
