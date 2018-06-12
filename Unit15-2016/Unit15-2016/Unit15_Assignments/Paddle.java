import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
	private int speed;
	private final int DEFAULT_SPEED = 5;

	public Paddle()
	{
		super(10,10);
		setSpeed(DEFAULT_SPEED);
	}
	public Paddle(int x, int y)
	{
		super(x,y);
		setSpeed(DEFAULT_SPEED);
	}
	public Paddle(int x, int y, int s)
	{
		super(x,y);
		setSpeed(s);
	}
	public Paddle(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		setSpeed(DEFAULT_SPEED);
	}
	public Paddle(int x, int y, int w, int h, int s)
	{
		super(x,y,w,h);
		setSpeed(s);
	}
	public Paddle(int x, int y, int w, int h, Color c, int s)
	{
		super(x,y,w,h,c);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
		speed = s;
	}

	public void moveLeftAndDraw(Graphics window)
	{
		draw(window,Color.BLACK);
		setX(getX() - speed);
		draw(window);
	}
	public void moveRightAndDraw(Graphics window)
	{
		draw(window,Color.BLACK);
		setX(getX() + speed);
		draw(window);
	}
	public void moveUpAndDraw(Graphics window)
	{
		draw(window,Color.BLACK);
		setY(getY() - speed);
		draw(window);
	}
	public void moveDownAndDraw(Graphics window)
	{
		draw(window,Color.BLACK);
		setY(getY() + speed);
		draw(window);
	}

	public int getSpeed()
	{
		return speed;
	}

	public String toString()
	{
		String ret = super.toString();
		ret += " ";
		ret += speed;
		return ret;
	}
}


