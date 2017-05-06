package JavaCool303;

import java.awt.Graphics;

/**
 * Interface Cool303Component
 * Every Cool303Component should all have 
 */
public interface Cool303Component {
	
	/**
	 * Get method for the label
	 * @return int the label of the component
	 */
	public int getComponentLabel();
	
	/**
	 * Set method for the theme
	 * @param theme the theme you want your component to have
	 */
	public void setTheme(Cool303Theme theme);
	
	/**
	 * paintComponent: method that should override the one the parents have
	 * @param g
	 */
	public void paint(Graphics g);

	/**
	 * paintBorder: method that should override the one the parents have
	 * @param g
	 */
	public void paintBorder(Graphics g);
}
