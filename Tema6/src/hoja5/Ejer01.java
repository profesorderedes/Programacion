package hoja5;

import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.event.FocusEvent;

import java.awt.event.FocusListener;

import javax.swing.JFrame;

import javax.swing.JTextField;

public class Ejer01 extends JFrame implements FocusListener {

	private JTextField txt1, txt2, txt3;

	public Ejer01() {

		super("Texto decorado");
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		setLocationRelativeTo(null);

		txt1 = new JTextField(6);
		txt2 = new JTextField(6);
		txt3 = new JTextField(6);

		txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);

		add(txt1);
		add(txt2);
		add(txt3);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer01 ventana = new Ejer01();

	}

	@Override
	public void focusGained(FocusEvent e) {

		JTextField txtCasilla = (JTextField) e.getSource();

		txtCasilla.setBackground(Color.YELLOW);

	}

	@Override
	public void focusLost(FocusEvent e) {

		((JTextField) e.getSource()).setBackground(Color.WHITE);

	}

}