import javax.swing.*;
import java.awt.*;

public class Ejemplo13 extends JFrame {
	
	public Ejemplo13() {
		
		super("Título");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// Imágenes para la barra de herramientas.
		ImageIcon imgLoad = new ImageIcon("iconos/load.gif");
		ImageIcon imgSave = new ImageIcon("iconos/save.gif");
		ImageIcon imgSubscribe = 
				new ImageIcon("iconos/subscribe.gif");
		ImageIcon imgUnsuscribe = 
				new ImageIcon("iconos/unsubscribe.gif");
		
		// Botones para la barra de herramientas.
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo13();
	}

}
