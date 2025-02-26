/* 
 * 2-24-25
 * Aarav Goyal
 * Constellation.java
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Constellation
{
	public static void main (String [] args)
	{
		Constellation c = new Constellation();
		c.runIt();
	}

	public void runIt()
	{
		JFrame frame = new JFrame("The Big Dipper");
		frame.setSize(630, 450);
		frame.setLocation(100, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setResizable(false);       
		DipperPanel mpPanel = new DipperPanel();
		frame.getContentPane().add(mpPanel);
		frame.setVisible(true);
	}
}

class DipperPanel extends JPanel
{
	public DipperPanel()
	{
		setBackground(Color.BLUE);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		drawText(g);
		drawMoon(g);
		drawDipper(g);
		drawPlanet(g);
		drawRocket(g);
	}

	public void drawText(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.setFont(new Font("serif", Font.ITALIC, 40));
		g.drawString("The Big Dipper", 170, 80);
		g.drawRect(160, 40, 270, 65);
	}

	public void drawMoon(Graphics g)
	{
		g.setColor(new Color(255, 255, 0));
		g.fillOval(0,0,110,110);
		g.setColor(Color.BLUE);
		g.fillOval(-20, -20, 110, 110);
	}

	public void drawDipper(Graphics g)
	{
		g.setColor(Color.WHITE);
		int[] X = {40, 180, 220, 380, 520, 540, 400, 380, 220, 180, 40};
		int[] Y = {220, 190, 200, 210, 140, 240, 300, 210, 200, 190, 220};
		g.drawPolygon(X,Y,11);

		g.fillOval(36,216, 8, 8);
		g.fillOval(175,186, 8, 8);
		g.fillOval(216,196, 8, 8);
		g.fillOval(376,206, 8, 8);
		g.fillOval(516,136, 8, 8);
		g.fillOval(536,236, 8, 8);
		g.fillOval(396,296, 8, 8);
	}

	public void drawPlanet(Graphics g) 
	{
		g.setColor(new Color(139, 69, 19));
		g.fillArc(-75, 370, 800, 200, 0, 180);
	}

	public void drawRocket(Graphics g) 
	{
		g.setColor(Color.RED);
		int[] rocketX = {60, 110, 140, 120, 75};
		int[] rocketY = {345, 335, 345, 370, 380};
		g.drawPolygon(rocketX, rocketY, 5);

		int[] flameX1 = {35, 60, 40};
		int[] flameY1 = {360, 355, 370};
		g.fillPolygon(flameX1, flameY1, 3);

		int[] flameX2 = {45, 70, 50};
		int[] flameY2 = {380, 375, 390};
		g.fillPolygon(flameX2, flameY2, 3);

		g.drawArc(-410, 345, 1100, 130, -90, 180);
	}
}
