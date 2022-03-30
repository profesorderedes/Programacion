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
		JButton btnLoad = new JButton(imgLoad);
		JButton btnSave = new JButton(imgSave);
		JButton btnSubscribe = new JButton(imgSubscribe);
		JButton btnUnsubscribe = new JButton(imgUnsuscribe);
		
		// Barra de herramientas.
		JToolBar barraHerramientas = new JToolBar();
		barraHerramientas.add(btnLoad);
		barraHerramientas.add(btnSave);
		barraHerramientas.add(btnSubscribe);
		barraHerramientas.add(btnUnsubscribe);
		
		// Añadimos controles a la ventana.
		add(barraHerramientas);
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo13();
	}

}
