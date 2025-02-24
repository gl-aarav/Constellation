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
		int[] X = {40, 180, 220, 380, 380, 520, 540, 400};
		int[] Y = {220, 190, 200, 220};
		g.drawPolygon(X,Y,3);
	}
	
	public void drawPlanet(Graphics g)
	{
		
	}
	
	public void drawRocket(Graphics g)
	{
		
	}
}
