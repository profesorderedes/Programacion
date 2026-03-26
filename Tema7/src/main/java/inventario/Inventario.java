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

	private List<String> articulos = new ArrayList<>();
	private DefaultListModel<String> modelo;
	private JList<String> inventario;

	public Inventario() {

		super("Inventario");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JButton btnMas = new JButton(new ImageIcon("iconos/13.png"));
		btnMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				anyadirArticulo();
				
			}
		});

		JButton btnMenos = new JButton(new ImageIcon("iconos/14.png"));
		btnMenos.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				eliminarArticulo();
				
			}
		});
		
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

		inventario = new JList<String>(modelo);

		add(barra, BorderLayout.NORTH);
		add(inventario, BorderLayout.CENTER);

		setVisible(true);

	}

	private void anyadirArticulo() {

		String nuevoArticulo = JOptionPane.showInputDialog(null, "Introduce artículo:", "Alta en el inventario",
				JOptionPane.QUESTION_MESSAGE);

		if (nuevoArticulo == null || nuevoArticulo.trim().equals("")) {
			return;
		}

		articulos.add(nuevoArticulo);

		modelo.addElement(nuevoArticulo);

	}
	
	private void eliminarArticulo() {
		
		// Si no hay ninguna fila de la lista seleccionada, salimos
		// sin hacer nada.
		int indice = inventario.getSelectedIndex();
		
		if(indice == -1) {
			return;
		}
		
		// Avisamos al usuario con un JOptionPane.
		String articulo = modelo.get(indice);
		JOptionPane.showConfirmDialog(null, "Va a eliminar el artículo " + articulo + ". ¿Está seguro?", "Inventario", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		
		
		
		
	}

	public static void main(String[] args) {

		new Inventario();

	}

}