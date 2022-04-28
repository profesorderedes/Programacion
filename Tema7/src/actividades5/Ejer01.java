package actividades5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ejer01 extends JFrame {

	public Ejer01() {

		super("Texto decorado");
		setSize(300, 120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		JTextField txtPrimero = new JTextField(7);
		txtPrimero.setEditable(false);
		txtPrimero.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtPrimero.setBackground(Color.WHITE);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txtPrimero.setBackground(Color.YELLOW);

			}
		});

		JTextField txtSegundo = new JTextField(7);
		txtSegundo.setEditable(false);
		txtSegundo.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtSegundo.setBackground(Color.WHITE);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txtSegundo.setBackground(Color.YELLOW);

			}
		});

		JTextField txtTercero = new JTextField(7);
		txtTercero.setEditable(false);
		txtTercero.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtTercero.setBackground(Color.WHITE);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txtTercero.setBackground(Color.YELLOW);

			}
		});

		add(txtPrimero);
		add(txtSegundo);
		add(txtTercero);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer01();
	}

}