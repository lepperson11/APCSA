//© A+ Computer Science  -  www.apluscompsci.com
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

	private Color color;

	public Block()
	{
	}
	public Block(int a, int b, int c, int d)
	{
		xPos = a;
		yPos = b;
		width = c;
		height = d;
	}
	public Block(int a, int b, int c, int d, Color col)
	{
		xPos = a;
		yPos = b;
		width = c;
		height = d;
		color = col;
	}
	//add other Block constructors - x , y , width, height, color
	
	
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void setX(int x) {
		xPos = x;
	}
	public void setY(int y) {
		yPos = y;
	}
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}   
	public void setWidth(int a){
		width = a;
	}
	public void setHeight(int a)
	{
		height = a;
	}
   public void setColor(Color col)
   {
	   color = col;

   }
   public int getWidth(){
	   return width;
   }
   public int getHeight(){
	   return height;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.drawRect(getX(),getY(),getWidth(),getHeight());
   }
   
	public boolean equals(Object obj)
	{




		return false;
	}


   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
}