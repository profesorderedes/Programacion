package ejemplosParte3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo02 extends JFrame implements ActionListener {

	private JButton btnCambiarColor;

	public Ejemplo02() {

		super("Cambiar color");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		btnCambiarColor = new JButton("Cambiar color");
		btnCambiarColor.setPreferredSize(new Dimension(200, 50));
		btnCambiarColor.addActionListener(this);

		add(btnCambiarColor);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btnCambiarColor.setBackground(new Color(50, 255, 50));
	}

}
