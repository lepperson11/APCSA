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
		Block comp = (Block)obj;
		if (getX() != comp.getX()) return false;
		if (getY() != comp.getY()) return false;
		if (getWidth() != comp.getWidth()) return false;
		if (getHeight() != comp.getHeight()) return false;
		if (getColor() != comp.getColor()) return false;
		return true;
	}
	public String toString()
	{
		String ret = "";
		ret += getX();
		ret += " ";
		ret += getY();
		ret += " ";
		ret += getWidth();
		ret += " ";
		ret += getHeight();
		ret += " ";
		ret += getColor();
		return ret;
	}
}