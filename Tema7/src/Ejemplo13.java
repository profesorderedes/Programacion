import javax.swing.*;
import java.awt.*;

public class Ejemplo13 extends JFrame {

	public Ejemplo13() {

		super("Barra de herramientas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Usamos BorderLayout para colocar correctamente
		// la barra de herramientas.
		setLayout(new BorderLayout());

		// Imágenes para la barra de herramientas.
		ImageIcon imgLoad = new ImageIcon("iconos/load.gif");
		ImageIcon imgSave = new ImageIcon("iconos/save.gif");
		ImageIcon imgSubscribe = new ImageIcon("iconos/subscribe.gif");
		ImageIcon imgUnsuscribe = new ImageIcon("iconos/unsubscribe.gif");

		// Botones para la barra de herramientas.
		JButton btnLoad = new JButton(imgLoad);
		JButton btnSave = new JButton(imgSave);
		JButton btnSubscribe = new JButton(imgSubscribe);
		JButton btnUnsubscribe = new JButton(imgUnsuscribe);

		// Barra de herramientas.
		JToolBar barraHerramientas = new JToolBar();
		barraHerramientas.add(btnLoad);
		barraHerramientas.add(btnSave);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnSubscribe);
		barraHerramientas.add(btnUnsubscribe);

		// Añadimos controles a la ventana.
		add(barraHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo13();
	}

}
