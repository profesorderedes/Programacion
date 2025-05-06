package actividades6;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejer01 extends JFrame {

	public Ejer01() {

		setTitle("Libreoffice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		setLocationRelativeTo(null);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al aplicar el look and feel");
			e.printStackTrace();
		}

		JMenuBar mnBarra = new JMenuBar();

		JMenu mnFormato = new JMenu("Formato");

		mnFormato.add(new JMenuItem("Limpiar formato directo"));
		mnFormato.addSeparator();
		mnFormato.add(new JMenuItem("Carácter"));
		mnFormato.add(new JMenuItem("Párrafo"));
		mnFormato.add(new JMenuItem("Numeración y viñetas"));
		mnFormato.addSeparator();
		mnFormato.add(new JMenuItem("Página"));

		JMenu mnTabla = new JMenu("Tabla");

		mnTabla.add(new JMenuItem("Insertar"));
		mnTabla.add(new JMenuItem("Eliminar"));
		mnTabla.addSeparator();
		mnTabla.add(new JMenuItem("Seleccionar"));
		mnTabla.add(new JMenuItem("Unir celdas"));

		mnBarra.add(mnFormato);
		mnBarra.add(mnTabla);

		setJMenuBar(mnBarra);
		
		// TODO Añadir componentes a la ventana (sólo está el menú).

	}

	public static void main(String[] args) {

		new Ejer01().setVisible(true);

	}

}