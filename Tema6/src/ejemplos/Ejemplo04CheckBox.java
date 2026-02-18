package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo04CheckBox extends JFrame {

	public Ejemplo04CheckBox() {

		super("Hobbies");
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		JLabel lblHobbies = new JLabel("Elije tus hobbies favoritos:");

		JCheckBox chkLeer = new JCheckBox("Leer", true);
		JCheckBox chkJugar = new JCheckBox("Jugar");
		JCheckBox chkVerSeries = new JCheckBox("Ver series");
		JCheckBox chkDibujar = new JCheckBox("Dibujar");
		JCheckBox chkViajar = new JCheckBox("Viajar");
		JCheckBox chkConducir = new JCheckBox("Conducir");

		add(lblHobbies);
		add(chkLeer);
		add(chkJugar);
		add(chkVerSeries);
		add(chkDibujar);
		add(chkViajar);
		add(chkConducir);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo04CheckBox ventana = new Ejemplo04CheckBox();
	}
}
