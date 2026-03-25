package inventario;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class Inventario extends JFrame {

	private List<String> articulos = new ArrayList<String>();
	private DefaultListModel<String> modelo;
	
	public Inventario() {

		super("Inventario");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JButton btnMas = new JButton(new ImageIcon("iconos/13.png"));
		btnMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String nuevoArticulo = JOptionPane.showInputDialog(null, "Introduce artículo:", "Alta en el inventario", JOptionPane.QUESTION_MESSAGE);
				
				if(nuevoArticulo == null || nuevoArticulo.trim().equals("")) {
					return;
				}
				
				articulos.add(nuevoArticulo);
				
				modelo.addElement(nuevoArticulo);
				
			}
		});
		
		
		JButton btnMenos = new JButton(new ImageIcon("iconos/14.png"));
		JButton btnLupa = new JButton(new ImageIcon("iconos/84.png"));
		JButton btnCalculadora = new JButton(new ImageIcon("iconos/41.png"));
		JButton btnFuego = new JButton(new ImageIcon("iconos/31.png"));

		JToolBar barra = new JToolBar();

		barra.add(btnMas);
		barra.add(btnMenos);
		barra.addSeparator();
		barra.add(btnLupa);
		barra.add(btnCalculadora);
		barra.add(btnFuego);

		articulos.add("HP con procesador i3");
		articulos.add("HP con procesador i5");
		articulos.add("HP con procesador i3");
		articulos.add("Monitor ASUS 17\"");

		modelo = new DefaultListModel<>();

		for (String articulo : articulos) {

			modelo.addElement(articulo);

		}

		JList<String> lista = new JList<String>(modelo);

		add(barra, BorderLayout.NORTH);

		add(lista);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Inventario();

	}

}