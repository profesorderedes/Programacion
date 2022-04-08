
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo27 extends JFrame implements ActionListener {

	private JLabel lblPulsado;
	
	public Ejemplo27() {

		super("Pulsaciones");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton btnPulsame = new JButton("Púlsame!");

		// Asignamos el manejador al botón.
		btnPulsame.addActionListener(this);
		
		lblPulsado = new JLabel();

		add(btnPulsame);
		add(lblPulsado);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo27();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		lblPulsado.setText("Bien!!!!");
		
	}

}
