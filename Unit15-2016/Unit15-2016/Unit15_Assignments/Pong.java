
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int score1;
	private int score2;
	
	public Pong()
	{
		ball = new SpeedUpBall(500, 200, 10, 10, Color.black, -1, 1);
		leftPaddle = new Paddle(50, 100, 20, 50, Color.blue, 5);
		rightPaddle = new Paddle(750, 100, 20, 50, Color.green, 5);
		keys = new boolean[4];
		setBackground(Color.WHITE);
		setVisible(true);
		new Thread(this).start();
		addKeyListener(this);
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}
	
	public void paint(Graphics window)
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;		
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if (back == null)
		{
			back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}		
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);		
		graphToBack.drawString("Player 1: " + score1, 200, 100);
		graphToBack.drawString("Player 2: " + score2, 500, 100);		
		//see if ball hits left wall or right wall
		if (!(ball.getX() >= 10 && ball.getX() <= 790))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if (ball.getX() > 790)
			{
				graphToBack.setColor(Color.white);
				graphToBack.drawString("Player 1: " + score1, 200, 100);
				score1++;
				graphToBack.setColor(Color.black);
				graphToBack.drawString("Player 1: " + score1, 200, 100);
			}
			else
			{
				graphToBack.setColor(Color.white);
				graphToBack.drawString("Player 1: " + score2, 500, 100);
				score2++;
				graphToBack.setColor(Color.black);
				graphToBack.drawString("Player 2: " + score2, 500, 100);
			}
			ball.draw(graphToBack, Color.white);
			ball = new SpeedUpBall(500, 200, 10, 10, Color.black, -1, 1);
		}
		
		//see if the ball hits the top or bottom wall
		if (!(ball.getY() >= 10 && ball.getY() <= 550)) ball.setYSpeed(-ball.getYSpeed());
		
		//see if the ball hits the left paddle
		
		if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())
			&& ((ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight())
			|| (ball.getY() + ball.getHeight() >= leftPaddle.getY() && ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())))
		{
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())) ball.setYSpeed(-ball.getYSpeed());
			else ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		//see if the ball hits the right paddle
		
		if (ball.getX() >= rightPaddle.getX() + rightPaddle.getWidth() - Math.abs(ball.getXSpeed())
			&& ((ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight())
			|| (ball.getY() + ball.getHeight() >= rightPaddle.getY() && ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())))
		{
			if (ball.getX() <= rightPaddle.getX() + rightPaddle.getWidth() + Math.abs(ball.getXSpeed())) ball.setYSpeed(-ball.getYSpeed());
			else ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		boolean nothing = (ball.didCollide(leftPaddle) || ball.didCollide(rightPaddle));
		if (ball.didCollideLeft(leftPaddle)) ball.setXSpeed(-ball.getXSpeed());
		else if (ball.didCollideRight(rightPaddle)) ball.setXSpeed(-ball.getXSpeed());
		else if (ball.didCollideTop(leftPaddle)) ball.setYSpeed(-ball.getYSpeed());
		else if (ball.didCollideTop(rightPaddle)) ball.setYSpeed(-ball.getYSpeed());
		else if (ball.didCollideBottom(leftPaddle)) ball.setYSpeed(-ball.getYSpeed());
		else if (ball.didCollideBottom(rightPaddle)) ball.setYSpeed(-ball.getYSpeed());
		
		//see if the paddles need to be moved
		if (keys[0]) leftPaddle.moveUpAndDraw(graphToBack);
		if (keys[1]) leftPaddle.moveDownAndDraw(graphToBack);
		if (keys[2]) rightPaddle.moveUpAndDraw(graphToBack);
		if (keys[3]) rightPaddle.moveDownAndDraw(graphToBack);
		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0] = true; break;
			case 'S' : keys[1] = true; break;
			case 'I' : keys[2] = true; break;
			case 'K' : keys[3] = true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0] = false; break;
			case 'S' : keys[1] = false; break;
			case 'I' : keys[2] = false; break;
			case 'K' : keys[3] = false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
	public void run()
	{
		try
		{
			while (true)
			{
				Thread.currentThread().sleep(8);
				repaint();
			}
		}catch(Exception e)
		{
		}
	}	
}
