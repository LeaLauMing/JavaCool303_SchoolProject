package JavaCool303;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;

public class Testmain{

	public static void main(String[] args) {
		
		Cool303Container y = new Cool303Container("Bonjour!");
		
		y.addComponent(new Cool303Button(5));
		y.addComponent(new Cool303Button(1));
		y.addComponent(new Cool303Button(8));
		y.addComponent(new Cool303Button(0));
		y.addComponent(new Cool303Button(3));
		y.addComponent(new Cool303Button(6));
		y.addComponent(new Cool303Button(4));
		y.addComponent(new Cool303Button(9));
		y.addComponent(new Cool303Button(2));
		y.addComponent(new Cool303Button(7));
		y.addComponent(new Cool303Button(10));
		y.addComponent(new Cool303Button(11));
		y.addComponent(new Cool303Button(12));
		y.addComponent(new Cool303Button(13));
		y.addComponent(new Cool303Button(14));
		y.addComponent(new Cool303Button(15));
		y.addComponent(new Cool303Button(16));
		y.addComponent(new Cool303Button(17));
		y.addComponent(new Cool303Button(18));
		y.addComponent(new Cool303Button(19));
		
		
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(400, 400));
		frame.setLayout(new GridBagLayout());
		Cool303Theme pastel = new Pastel();
		
		Cool303Box box = new Cool303Box(30,300, pastel);
		box.addContainer(y);
		frame.add(box);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();	
		frame.setVisible(true);

	}

}
