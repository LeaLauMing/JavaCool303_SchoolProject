package JavaCool303;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Interface Cool303Theme
 * Every new theme should have 
 */
public interface Cool303Theme {
	
	/**
	 * what you want to add in paint in Component
	 * @param g
	 */
	public void paintComponent(Graphics g);
	
	/**
	 * Paint the border
	 * @param g
	 */
	public void paintBorder(Graphics g);
	/**
	 * @return Color that you want your Box to be
	 */
	public Color colorBoxBackground();
	/**
	 * What you want to add in paint in Box
	 * @param g
	 * @param width of the box
	 * @param height of the box
	 */
	public void paintBox(Graphics g, int width, int height);
	
	
}
