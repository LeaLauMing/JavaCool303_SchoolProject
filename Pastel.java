package JavaCool303;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Pastel implements Cool303Theme{
	
	/**
	 * what you want to add in paint method in Component
	 * @param g
	 */
	public void paintComponent(Graphics g) {

		g.setColor(Color.pink);
		g.drawOval(0, 0, 40, 27);
		g.fillOval(0, 0, 40, 27);
	}
	
	/**
	 * @return Color that you want your Box to be
	 */
	public Color colorBoxBackground(){
		return new Color(255, 218, 185);
	}
	/**
	 * what you want to add in paint method in Box
	 * @param g
	 */
	public void paintBox(Graphics g, int width, int height){
		Graphics2D graphics = (Graphics2D) g;
		graphics.setStroke(new BasicStroke(14));
		graphics.setColor(new Color(238,238,238));
	    graphics.drawRoundRect(0, 0, width-1, height-1, 40, 40);
		graphics.dispose();
	}
	
	/**
	 * Paint the border
	 * @param g
	 */
	public void paintBorder(Graphics g){
		g.setColor(Color.yellow);
	    g.drawOval(0, 0, 40, 27);
	}
	
}
