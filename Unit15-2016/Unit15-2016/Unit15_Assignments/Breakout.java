import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Breakout extends Canvas implements KeyListener, Runnable
{
	/** Instance Variables */
	private boolean paused;
	private boolean afterPaused;
	private int pauseTimer;
	private boolean moveLevel;
	private int waitTimer;
	private int moveTimer;
	private Ball ball;
	private Paddle paddle;
	private int score;
	private int level;
	private List<Block> bricks;
	private boolean[] keys;
	private BufferedImage back;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600 - 20;
	private static final int BALLBOUND = 10;
	private static final int PADDLEBOUND = 80;

	/** Constructor */
	public Breakout()
	{
		level = 1;
		startLevel(level);
	}

	private void startLevel(int n)
	{
		paused = false;
		afterPaused = false;
		pauseTimer = 0;
		moveLevel = false;
		waitTimer = 0;
		moveTimer = 0;
		ball = new Ball(395, 265, 10, 10, Color.WHITE, -(level + 1), -(level + 1));
		paddle = new Paddle(380, 280, 40, 40, Color.BLUE, 5);
		score = 0;
		bricks = new ArrayList<Block>();
		for(int x = 30; x < 740; x += 110) for(int y = 10; y < 50; y += 30)
		{
			bricks.add(new Block(x,y,80,20,Color.GREEN));
			bricks.add(new Block(x,y + 510,80,20,Color.GREEN));
		}
		for(int y = 71; y < 500; y += 110) for(int x = 10; x < 50; x += 30)
		{
			bricks.add(new Block(x,y,20,80,Color.GREEN));
			bricks.add(new Block(x + 730,y,20,80,Color.GREEN));
		}
		keys = new boolean[5];
		setBackground(Color.BLACK);
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
		// set up background
		Graphics2D twoDGraph = (Graphics2D)window;
		if (back == null) back = (BufferedImage)(createImage(getWidth(),getHeight()));
		Graphics graphToBack = back.createGraphics();
		// if game is paused
		if (paused)
		{
			pauseTimer++;
			if (keys[4] && pauseTimer > 125)
			{
				pauseTimer = 0;
				paused = false;
				afterPaused = true;
			}
		}
		else if (moveLevel)
		{
			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(0,0,800,600);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("DONE WITH LEVEL " + (level - 1),25,50);
			graphToBack.drawString("MOVING ON TO LEVEL " + level,25,100);
			moveTimer++;
			if (moveTimer > 625)
			{
				moveTimer = 0;
				startLevel(level);
				graphToBack.setColor(Color.BLACK);
				graphToBack.fillRect(0,0,800,600);
				moveLevel = false;
			}
		}
		// if game is running
		else
		{
			// move and draw ball and paddle
			ball.moveAndDraw(graphToBack);
			paddle.draw(graphToBack);
			if (!(ball.getX() >= BALLBOUND && ball.getX() <= WIDTH - BALLBOUND - ball.getWidth())) ball.setXSpeed(-ball.getXSpeed());
			if (!(ball.getY() >= BALLBOUND && ball.getY() <= HEIGHT - BALLBOUND - ball.getHeight())) ball.setYSpeed(-ball.getYSpeed());
			if (keys[0]) paddle.moveLeftAndDraw(graphToBack);
			if (keys[1]) paddle.moveRightAndDraw(graphToBack);
			if (keys[2]) paddle.moveUpAndDraw(graphToBack);
			if (keys[3]) paddle.moveDownAndDraw(graphToBack);
			if (paddle.getX() < PADDLEBOUND) paddle.moveRightAndDraw(graphToBack);
			if (paddle.getX() > WIDTH - PADDLEBOUND - paddle.getWidth()) paddle.moveLeftAndDraw(graphToBack);
			if (paddle.getY() < PADDLEBOUND) paddle.moveDownAndDraw(graphToBack);
			if (paddle.getY() > HEIGHT - PADDLEBOUND - paddle.getHeight()) paddle.moveUpAndDraw(graphToBack);
			// check for ball hitting paddle
			if (ball.didCollideLeft(paddle) || ball.didCollideRight(paddle)) ball.setXSpeed(-ball.getXSpeed());
			if (ball.didCollideTop(paddle) || ball.didCollideBottom(paddle)) ball.setYSpeed(-ball.getYSpeed());
			// check for ball hitting bricks
			for (int i = 0; i < bricks.size(); i++)
			{
				String didWeMeet = ball.didCollide(bricks.get(i));
				if (didWeMeet.length() == 1)
				{
					bricks.get(i).draw(graphToBack,Color.BLACK);
					score++;
					bricks.remove(i);
					i--;
					if (didWeMeet == "L" || didWeMeet == "R") ball.setXSpeed(-ball.getXSpeed());
					if (didWeMeet == "T" || didWeMeet == "B") ball.setYSpeed(-ball.getYSpeed());
				}
				else
				{
					bricks.get(i).draw(graphToBack);
				}
			}
			// check if level is over
			if (bricks.size() == 0)
			{
				waitTimer++;
				if (waitTimer > 375)
				{
					waitTimer = 0;
					level++;
					moveLevel = true;
				}
			}
			// check if we want pause
			if (keys[4] && !afterPaused) paused = true;
			if (afterPaused)
			{
				pauseTimer++;
				if (pauseTimer > 125)
				{
					pauseTimer = 0;
					afterPaused = false;
				}
			}
		}
		twoDGraph.drawImage(back,null,0,0);
	}

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT) keys[0] = true;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) keys[1] = true;
		if (e.getKeyCode() == KeyEvent.VK_UP) keys[2] = true;
		if (e.getKeyCode() == KeyEvent.VK_DOWN) keys[3] = true;
		if (e.getKeyCode() == KeyEvent.VK_P) keys[4] = true;
	}
	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT) keys[0] = false;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) keys[1] = false;
		if (e.getKeyCode() == KeyEvent.VK_UP) keys[2] = false;
		if (e.getKeyCode() == KeyEvent.VK_DOWN) keys[3] = false;
		if (e.getKeyCode() == KeyEvent.VK_P) keys[4] = false;
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