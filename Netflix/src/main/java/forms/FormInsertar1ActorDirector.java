package forms;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormInsertar1ActorDirector extends JDialog {

	private JTextField txtNombre;
	private JCheckBox chkActor, chkDirector;

	public FormInsertar1ActorDirector(FormPrincipal ventanaPrincipal) {

		super(ventanaPrincipal, true);
		setTitle("Netflix Database");
		setSize(300, 180);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setResizable(false);

		setLocationRelativeTo(null);

		// Nombre
		txtNombre = new JTextField(20);

		// Checkboxes

		chkActor = new JCheckBox("Actor");
		chkDirector = new JCheckBox("Director");

		JPanel pnlCheckBoxes = new JPanel();

		pnlCheckBoxes.setPreferredSize(new Dimension(280, 35));

		pnlCheckBoxes.add(chkActor);
		pnlCheckBoxes.add(chkDirector);

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

		add(new JLabel("¿Cuál es el nombre del actor / director?"));
		add(txtNombre);
		add(pnlCheckBoxes);
		add(btnAceptar);

		setVisible(true);
	}

	public String getNombre() {

		return txtNombre.getText();

	}

	public boolean isActor() {
		return chkActor.isSelected();
	}

	public boolean isDirector() {
		return chkDirector.isSelected();
	}
}
