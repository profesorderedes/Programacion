package ejemplosParte3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo09MouseListener extends JFrame implements MouseListener {

	private JLabel lblCoordenadas, lblBoton;

	public Ejemplo09MouseListener() {

		super("MouseListener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		addMouseListener(this);

		lblCoordenadas = new JLabel("Haz clic en esta ventana");
		lblBoton = new JLabel();

		add(lblCoordenadas);
		add(lblBoton);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo09MouseListener();
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		lblCoordenadas.setText("x = " + e.getX() + ", y = " + e.getY());

		if (e.getButton() == 1) {
			lblBoton.setText("Botón izquierdo");
		} else if (e.getButton() == 2) {
			lblBoton.setText("Botón rueda");
		} else if (e.getButton() == 3) {
			lblBoton.setText("Botón derecho");
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

		getContentPane().setBackground(Color.RED);

	}

	@Override
	public void mouseExited(MouseEvent e) {

		getContentPane().setBackground(Color.GREEN);

	}

}
