package multiplesVentanasJDialog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormSecundario extends JDialog {

	private JTextField txtNombre, txtApellidos;

	/*
	 * Hemos cambiado la ventana secundaria para que sea un JDialog en lugar de un
	 * JFrame. Además la abriremos de forma modal y así la ventana principal quedará
	 * deshabilitada mientras esté ésta abierta.
	 */
	public FormSecundario(FormPrincipal ventanaPrincipal, Identidad identidad) {

		// La ventana secundaria se comportará como un diálogo modal (no se puede tocar
		// la ventana principal mientras la secundaria esté abierta).
		super(ventanaPrincipal, true);
		setTitle("Ventana secundaria");
		setSize(300, 180);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		txtNombre = new JTextField(25);
		txtApellidos = new JTextField(25);

		txtNombre.setText(identidad.getNombre());
		txtApellidos.setText(identidad.getApellidos());

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		add(new JLabel("Nombre:"));
		add(txtNombre);
		add(new JLabel("Apellidos:"));
		add(txtApellidos);
		add(btnAceptar);

		setVisible(true);

	}
	
	public Identidad getIdentidad() {
		return new Identidad(txtNombre.getText(), txtApellidos.getText());
	}

}
