package forms;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FormConsulta1Shows extends JDialog {

	private JRadioButton radioPeliculas, radioSeries;

	public FormConsulta1Shows(FormPrincipal ventanaPrincipal) {

		super(ventanaPrincipal, true);
		setTitle("Netflix Database");
		setSize(300, 180);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setResizable(false);

		setLocationRelativeTo(null);

		// Radio Buttons

		ButtonGroup radioButtons = new ButtonGroup();

		radioPeliculas = new JRadioButton("Peliculas", true);

		radioSeries = new JRadioButton("Series");

		radioButtons.add(radioPeliculas);
		radioButtons.add(radioSeries);

		JPanel pnlRadioButtons = new JPanel();
		pnlRadioButtons.setPreferredSize(new Dimension(280, 35));
		pnlRadioButtons.setLayout(new FlowLayout(FlowLayout.LEFT));

		pnlRadioButtons.add(radioPeliculas);
		pnlRadioButtons.add(radioSeries);

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

		add(new JLabel("¿Qué quieres ver?"));
		add(pnlRadioButtons);
		add(btnAceptar);

		setVisible(true);
	}

	public int getTipoShow() {

		if (radioPeliculas.isSelected()) {
			return 1;
		} else {
			return 2;
		}

	}

}