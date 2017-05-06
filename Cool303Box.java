package JavaCool303;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.event.*;

/**
 * 
 *Extends JPanel
 */
public class Cool303Box extends JPanel{
	
	private Cool303Theme theme;
	private double width = 0;
	private double height = 0;
	private double heightAssign;
	private double widthAssign;
	
	
	/**
	 * Constructor of the box
	 * @param heightWanted integer of the height you want the box to have
	 * @param widthWanted  integer of the width you want the box to have
	 * @param themeInput Cool303Theme of the box
	 * @throws IllegalArgumentException if height or width are negative
	 */
	public Cool303Box(int heightWanted, int widthWanted, Cool303Theme themeInput){
		//Create JPanel
		super(new GridBagLayout());
		if(heightWanted >= 0 && widthWanted >= 0){
			this.heightAssign = heightWanted;
			this.widthAssign = widthWanted;
		}
		else{
			throw new IllegalArgumentException("Illegal height or width");
		}
		
		setTheme(themeInput);
	}
	
	/**
	 * Set theme for the box
	 * @param themeToSet Cool303Theme theme to set
	 */
	public void setTheme(Cool303Theme themeToSet){
		if(themeToSet != null){
			this.theme = themeToSet;
		}
		else{
			throw new IllegalArgumentException("Illegal theme");
		}
	}
	
	/**
	 * Override function paint(Graphics g)
	 * @param g 
	 */
	public void paint(Graphics g){
		super.paint(g);
		super.setBackground(theme.colorBoxBackground());
		theme.paintBox(g, super.getWidth(), super.getHeight());	    
		g.dispose();
	}
	
	/**
	 * Add a container in the box
	 * @param container Cool303Container you want to add
	 * @throws IllegalArgumentException if input is null
	 */
	public void addContainer(Cool303Container container){
		
		if(container != null){
			container.setTheme(this.theme);
			updateSize(container.getSize().getHeight(), container.getSize().getWidth());
			super.add(container);
		}
		else{
			throw new IllegalArgumentException("container input is null");
		}

	}
	
	/**
	 * Update the size of the box
	 * Verify if the input size of the user is too small or not
	 * @param containerH height of the container you want to add
	 * @param containerW width of the container you want to add
	 */
	private void updateSize(double containerH, double containerW){
		
		if(containerH >= 0 && containerW >= 0){
			
			if(containerH > this.height || this.height == 0){
				this.height = containerH;
			}
			
			this.width = this.width + containerW;
			
			if(this.heightAssign < this.height || this.widthAssign < this.width ){
				super.setPreferredSize(new Dimension((int)this.width+20, (int)this.height+30));
			}
			else{
				super.setPreferredSize(new Dimension((int)this.widthAssign, (int)this.heightAssign));
			}
			
		}
		else{
			throw new IllegalArgumentException("Incorrect input for the size.");
		}
	}
	
	public int getHeight(){
		return super.getHeight();
	}
	
	public int getWidth(){
		return super.getWidth();
	}
	
}
