package actividades6;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejer01 extends JFrame {

	public Ejer01() {

		setTitle("Libreoffice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		setLocationRelativeTo(null);

		JMenuBar mnBara = new JMenuBar();

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
		mnBara.add(mnFormato);
		mnBara.add(mnTabla);

		setJMenuBar(mnBara);

	}

	public static void main(String[] args) {

		new Ejer01().setVisible(true);

	}

}