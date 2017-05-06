package JavaCool303;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;


/**
 * Class that create a Cool303Container object that can store components
 * Extends JPanel
 */
public class Cool303Container extends JPanel{
	
	//ArrayList that stores component
	private ArrayList<Cool303Component> componentList = new ArrayList<Cool303Component>(); 
	//The title  of the container
	private JLabel titleDisplayed;
	//Constraints we need when adding a component
	private GridBagConstraints constraints = new GridBagConstraints();
	//gridx and gridy indicate where to put the component
	private int gridx = 1;
	private int gridy = 1;
	private int counterChangeY = 0;

	
	/**
	 * Constructor with title
	 * @param titleInput String input for title
	 */
	public Cool303Container(String titleInput){
		super(new GridBagLayout());
		super.setBackground(new Color(0, 0, 0, 0));
		if(titleInput != null){
			this.titleDisplayed = new JLabel(titleInput);
			locateTopLeft();
		}
	}	
	
	/**
	 * Constructor without title
	 */
	public Cool303Container(){
		this.gridx = 0;
		this.gridy = 0;
	}
	
	/**
	 * Locate the title at the top left of the container
	 */
	private void locateTopLeft(){
		//Set the constraints before adding the title to the container
		constraints.anchor = GridBagConstraints.NORTHWEST;
		constraints.insets = new Insets(10,10,10,10);
		constraints.gridx = 0;
		constraints.gridy = 0;
		//Add title in container with constraints 
		super.add(this.titleDisplayed, constraints);	
	}
	
	/**
	 * Add component in container
	 * @param componentAdded A Cool303Component 
	 * @throws IllegalArgumentException if gridx or gridy is negative
	 */
	public void addComponent(Cool303Component componentAdded){
		
		if(componentAdded != null){
			
			//if the component you want to add has an unique label, it is added inside the container
			if(isUnique(componentAdded)){
				
				//Add the component is the arraylist
				componentList.add(componentAdded);
				GridBagConstraints constraints = new GridBagConstraints();
				constraints.anchor = GridBagConstraints.CENTER;
				
				if(this.gridx >= 0 && this.gridy >= 0 && this.counterChangeY >= 0){
					//if there are 5 buttons on the row, change row
					if(this.counterChangeY%5 == 0){
						this.gridy++;
						this.gridx = 1;
					}
					constraints.gridx = this.gridx;
					constraints.gridy = this.gridy;
					this.counterChangeY++;
					this.gridx++;
				}
				else{
					throw new IllegalArgumentException("gridx or gridy is negative.");
				}
				//add the button in container with constraints
				super.add((Cool303Button)componentAdded, constraints);
			}
			//if the label is not unique
			else{
				System.out.println("The label is not unique: Cool303Component is not added.");
			}
		}
		else{
			throw new IllegalArgumentException("Illegal component.");
		}
	
	}
	
	/**
	 * Verify if the button you want to add in the container is unique
	 * If it is, add to container
	 * @param compToVerify component we want to add in the container
	 * @return boolean true if unique false if not unique
	 * @throws IllegalArgumentException if Cool303Component compToVerify is null
	 */
	private boolean isUnique(Cool303Component compToVerify){
		if(compToVerify != null){
			for(int i = 0; i < this.componentList.size(); i++){
				if(this.componentList.get(i).getComponentLabel() == compToVerify.getComponentLabel()){
					return false;
				}
			}
			return true;
		}
		else{
			throw new IllegalArgumentException("Illegal component to verify.");
		}
	}
	
	/**
	 * Give the theme to all the components in the arraylist
	 * @param themeInput Theme we want to pass
	 * @throws IllegalArgumentException if the theme is illegal/null
	 */
	public void setTheme(Cool303Theme themeInput){
		if(themeInput != null){
			//for all components in list setTheme
			for(int i = 0; i < this.componentList.size(); i++){
				this.componentList.get(i).setTheme(themeInput);
			}
			
		}
		else{
			throw new IllegalArgumentException("Illegal theme");
		}
	}
	
	
	/**
	 * Get dimension of container
	 * @return dimension of container
	 */
	public Dimension getSize(){
		return super.getPreferredSize();
	}
	
}
