package forms;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormConsulta2Director extends JDialog {

	private JTextField txtDirector;

	public FormConsulta2Director(FormPrincipal ventanaPrincipal) {

		super(ventanaPrincipal, true);
		setTitle("Netflix Database");
		setSize(300, 180);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setResizable(false);

		setLocationRelativeTo(null);

		txtDirector = new JTextField(20);

		// Aceptar Button

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setPreferredSize(new Dimension(75, 25));
		btnAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});

		// Window options

		add(new JLabel("¿Cuál es el nombre del director?"));
		add(txtDirector);
		add(btnAceptar);

		setVisible(true);
	}

	public String getDirector() {

		return txtDirector.getText();

	}

}