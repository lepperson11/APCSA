import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public List<Alien> getList(){
		return aliens;
	}

	public void drawEmAll( Graphics window )
	{ // add positions
		for(Alien a: aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(Alien a: aliens) {
			a.setX(a.getX() + a.getSpeed());
			if((a.getX() < 10 && a.getY() > 60)|| a.getX() > 725) {
				a.setSpeed(a.getSpeed() * -1);
				a.setY(a.getY() + 50);
			}

		}
	}

	public void removeDeadOnes(Bullets shots)
	{
		for(Alien a: aliens) {
			for(Ammo b: shots.getList()) {
				if (0 < (b.getX() - a.getX()) 
						&& (b.getX() - a.getX()) < 30
						&& (b.getY() - a.getY()) > 0
						&& (b.getY() - a.getY()) < 30) {
					shots.getList().remove(b);
					aliens.remove(a);
				}

			}
		}
	}

	public String toString()
	{
		return "";
	}
}