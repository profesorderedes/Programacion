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
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JTextField txtArea1 = new JTextField(8);
		txtArea1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtArea1.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txtArea1.setBackground(Color.YELLOW);
			}

		});

		JTextField txtArea2 = new JTextField(8);
		txtArea2.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtArea2.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txtArea2.setBackground(Color.YELLOW);
			}

		});

		JTextField txtArea3 = new JTextField(8);
		txtArea3.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtArea3.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txtArea3.setBackground(Color.YELLOW);
			}

		});

		add(txtArea1);
		add(txtArea2);
		add(txtArea3);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer01();

	}

}