package JavaCool303;

import java.awt.Color;
import java.awt.Graphics;

/**
 * winter theme
 * implements Cool303Theme
 *
 */
public class Winter implements Cool303Theme{
	
	/**
	 * what you want to add in paint in Component
	 * @param g
	 */
	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.drawRect(0, 0, 60, 30);
	}
	/**
	 * Return the color of the box
	 * @return Color 
	 */
	public Color colorBoxBackground() {
		return new Color(204, 230, 255);
	}
	
	/**
	 * What you want to add in paint in Box
	 * @param g
	 * @param width of the box
	 * @param height of the box
	 */
	public void paintBox(Graphics g, int width, int height){
		g.setColor(Color.cyan);
		g.drawRect(0, 0, width, height);
		g.drawRect(0, 0, width, height);
		
	}
	
	/**
	 * Paint the border
	 * @param g
	 */
	public void paintBorder(Graphics g){
		g.setColor(Color.white);
	}
}
