package proyectoHallOfFame;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class HallOfFame extends JFrame {

	public HallOfFame() {

		super("Puntuaciones");
		setSize(400, 570);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblHallOfFame = new JLabel("Hall of fame");

		DefaultListModel<String> modelo = new DefaultListModel<String>();
		JList<String> lstJugadores = new JList<String>(modelo);

		JScrollPane panelJugadores = new JScrollPane(lstJugadores);
		panelJugadores.setPreferredSize(new Dimension(380, 450));

		JButton btnNuevo = new JButton("Nuevo");
		JButton btnBorrar = new JButton("Borrar");

		add(lblHallOfFame);
		add(panelJugadores);
		add(btnBorrar);
		add(btnNuevo);

		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HallOfFame();
	}
}
