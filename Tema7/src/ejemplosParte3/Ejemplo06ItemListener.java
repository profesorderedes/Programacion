package ejemplosParte3;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo06ItemListener extends JFrame implements ItemListener{

	private JComboBox<String> cmbDeportes;

	public Ejemplo06ItemListener() {

		super("Item Listener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblDeportes = new JLabel("Elije un deporte:");

		String[] deportes = { "Ping pong", "Fútbol", "Baloncesto", "Petanca", "Tenis", "Ajedrez", "Waterpolo", "Judo",
				"Rugby", "Boxeo" };
		
		cmbDeportes = new JComboBox<String>(deportes);
		cmbDeportes.addItemListener(this);
		
		add(lblDeportes);
		add(cmbDeportes);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo06ItemListener();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		//System.out.println("Has elegido " + cmbDeportes.getSelectedItem());
		System.out.println("Has elegido la opción " + cmbDeportes.getSelectedIndex());
		
	}

}






