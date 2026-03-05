package ejemplosParte3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo03ActionListener extends JFrame implements ActionListener {

	private JButton btnAceptar, btnCancelar;
	private JLabel lblMensaje;

	public Ejemplo03ActionListener() {

		super("ActionListener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);

		lblMensaje = new JLabel();

		add(btnAceptar);
		add(btnCancelar);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo03ActionListener();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnAceptar) {
			lblMensaje.setText("Has pulsado Aceptar");
		}else {
			lblMensaje.setText("Has pulsado Cancelar");
		}
		
	}

}






