package JavaCool303;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A class for a Cool303Button.
 * It is a child of Cool303Component so, it implements Coool303Component
 */
public class Cool303Button extends JButton implements Cool303Component {
	
	private Cool303Theme theme;		//Store the theme 
	private int label;				//Store int label of the button
	
	/**
	 * Constructor
	 * @param label 
	 * It's the label of the button will show when you click on it
	 * @throws IllegalArgumentException if the label is negative
	 */
	public Cool303Button(int label){
		//Construct button
		super(Integer.toString(label));
		//Verify if label is positive
		if(label >= 0){
			this.label = label;
			setButtonAction(label);
		}
		else{
			throw new IllegalArgumentException("Illegal label.");
		}
	}
	
	/**
	 * It sets the action of the button and add action listener
	 * @param labelNb the label we want to show in the console when 
	 * @throws IllegalArgumentException if the label is smaller than 0
	 */
	private void setButtonAction(int labelNb){
		if(labelNb >= 0){
			super.setActionCommand("Click");
			super.addActionListener(new ButtonClickListener());
		}
		else{
			throw new IllegalArgumentException("Illegal label.");
		}
	}
	
	 /**
	 * Get the label of the component
	 * @return label the global var label
	 */
	public int getComponentLabel(){
		return this.label;
	}
	
	/**
	 * Set the themeInput in this function into the global var theme and repaint the button
	 * @param themeInput the theme we want our button to use
	 * @throws IllegalArgumentException when themeInput is null
	 */
	public void setTheme(Cool303Theme themeInput){
		if(themeInput != null){
			this.theme = themeInput;
			repaint();
		}
		else{
			throw new IllegalArgumentException("Illegal theme");
		}
	}
	
	/** 
	 * Override paintComponent
	 * @param g the graphics of the button
	 */
	public void paint(Graphics g) {
		super.paint(g);
		super.setOpaque(false);
		super.setContentAreaFilled(false);
		super.setBorderPainted(false);
		//Call the function paintComponent of the theme
		this.theme.paintComponent(g);
	}
	
	/**
	 * Override paintBorder
	 * @param g the graphics of the button
	 */
	public void paintBorder(Graphics g){
		super.paintBorder(g);
		super.setOpaque(false);
		super.setContentAreaFilled(false);
		super.setBorderPainted(false);
		//Call the function paintBorder of the theme
		this.theme.paintBorder(g);
	}
	
	/**
	 *Private class for the action performed by the button.
	 *Implements ActionListener
	 */
	private class ButtonClickListener implements ActionListener{
		
		/**
		 * When we click on the button, the label is printed
		 * @param e the ActionEvent of the button created
		 */
		public void actionPerformed(ActionEvent e){
			
			try{
				String command = e.getActionCommand();
				if(command.equals("Click")){
					int buttonLabel = getComponentLabel();
					System.out.println(buttonLabel);
				}
			}
			catch(Exception exception){
				System.out.println("Exception catched");
			}
			
		}
		
	}
	
	
}
