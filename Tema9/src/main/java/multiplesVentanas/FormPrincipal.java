package multiplesVentanas;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormPrincipal extends JFrame {

	private FormSecundario ventanaSecundaria;
	private Identidad identidad;
	private JLabel lblNombre;
	private JButton btnModificar;

	public FormPrincipal() {

		super("Ventana principal");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		identidad = new Identidad("-", "-");

		// Panel nombre y apellidos.
		JPanel panelNombre = new JPanel();
		panelNombre.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelNombre.setPreferredSize(new Dimension(380, 80));

		lblNombre = new JLabel(identidad.toString());
		panelNombre.add(lblNombre);

		lblNombre.setFont(new Font("Arial", Font.PLAIN, 48));

		btnModificar = new JButton("Modificar nombre");
		btnModificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				abrirVentana();
			}
		});

		add(new JLabel("Tu nombre es:"));
		add(panelNombre);
		add(btnModificar);

		setVisible(true);

	}

	private void abrirVentana() {

		if (ventanaSecundaria != null) {
			return;
		}

		ventanaSecundaria = new FormSecundario();

		ventanaSecundaria.setIdentidad(identidad);
		ventanaSecundaria.setCompletar(new Completar() {
			@Override
			public void actualizarNombre(Identidad nuevaIdentidad) {

				lblNombre.setText(nuevaIdentidad.getNombre() + " " + nuevaIdentidad.getApellidos());
				identidad = nuevaIdentidad;
				ventanaSecundaria = null;

			}
		});

	}

	public static void main(String[] args) {
		new FormPrincipal();
	}

}
