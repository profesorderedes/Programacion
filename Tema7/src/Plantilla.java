import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Plantilla extends JFrame {
	
	public Plantilla() {
		
		super("Título");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		try {
			UIManager.setLookAndFeel(
					"com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Plantilla();
	}

}
