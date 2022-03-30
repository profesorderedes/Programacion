import javax.swing.*;
import java.awt.*;

public class Plantilla extends JFrame {
	
	public Plantilla() {
		
		super("Título");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Plantilla();
	}

}
