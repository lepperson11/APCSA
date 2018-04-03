//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;

import java.awt.Graphics;

public class Block implements Locatable


{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private final int DEFAULT_X = 100;
	private final int DEFAULT_Y = 150;
	private final int DEFAULT_DIM = 10;
	private final Color DEFAULT_COLOR = Color.black;
	private Color color;
	public Block()
	{
		setPos(DEFAULT_X,DEFAULT_Y);
		setDim(DEFAULT_DIM,DEFAULT_DIM);
		setColor(DEFAULT_COLOR);
	}
	public Block(int x, int y)
	{
		setPos(x,y);
		setDim(DEFAULT_DIM,DEFAULT_DIM);
		setColor(DEFAULT_COLOR);
	}
	public Block(int x, int y, int w, int h)
	{
		setPos(x,y);
		setDim(w,h);
		setColor(DEFAULT_COLOR);
	}
	public Block(int x, int y, int w, int h, Color c)
	{
		setPos(x,y);
		setDim(w,h);
		setColor(c);
	}
	public void setX(int x)
	{
		xPos = x;
	}
	public void setY(int y)
	{
		yPos = y;
	}
	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}
	public void setWidth(int w)
	{
		width = w;
	}
	public void setHeight(int h)
	{
		height = h;
	}
	public void setDim(int w, int h)
	{
		width = w;
		height = h;
	}
	public void setColor(Color c)
	{
		color = c;
	}
	public void draw(Graphics window)
	{
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public void draw(Graphics window, Color c)
	{
		window.setColor(c);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	public int getX()
	{
		return xPos;
	}
	public int getY()
	{
		return yPos;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public Color getColor()
	{
		return color;
	}
	public boolean equals(Object obj)
	{
		Block cp = (Block)obj;
		if (getX() != cp.getX()) return false;
		if (getY() != cp.getY()) return false;
		if (getWidth() != cp.getWidth()) return false;
		if (getHeight() != cp.getHeight()) return false;
		if (getColor() != cp.getColor()) return false;
		return true;
	}
	public String toString()
	{
		String word = "";
		word += getX();
		word += " ";
		word += getY();
		word += " ";
		word += getWidth();
		word += " ";
		word += getHeight();
		word += " ";
		word += getColor();
		return word;
	}
}