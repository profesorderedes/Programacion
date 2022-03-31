import javax.swing.*;
import java.awt.*;

public class Ejemplo16 extends JFrame {
	
	public Ejemplo16() {
		
		super("Menús");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo16();
	}

}
