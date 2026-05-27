package multiplesVentanas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormSecundario extends JFrame {

	private Identidad identidad;
	private Completar completar;
	private JTextField txtNombre, txtApellidos;

	public FormSecundario() {

		super("Ventana secundaria");
		setSize(300, 180);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		txtNombre = new JTextField(25);
		txtApellidos = new JTextField(25);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarIdentidad();
			}
		});

		add(new JLabel("Nombre:"));
		add(txtNombre);
		add(new JLabel("Apellidos:"));
		add(txtApellidos);
		add(btnAceptar);

		setVisible(true);

	}

	public void setIdentidad(Identidad identidad) {

		this.identidad = identidad;
		System.out.println(identidad.toString());

		txtNombre.setText(identidad.getNombre());
		txtApellidos.setText(identidad.getApellidos());

	}

	public void setCompletar(Completar completar) {
		this.completar = completar;
	}

	private void actualizarIdentidad() {
		completar.actualizarNombre(new Identidad(txtNombre.getText(), txtApellidos.getText()));
		dispose();
	}

	public static void main(String[] args) {
		new FormSecundario();
	}

}
