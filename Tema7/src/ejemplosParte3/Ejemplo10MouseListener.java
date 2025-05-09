package ejemplosParte3;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo10MouseListener extends JFrame implements MouseListener {

	private JLabel lblCoordenadas;

	public Ejemplo10MouseListener() {

		super("Mouse Listener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		lblCoordenadas = new JLabel("Pulsa en cualquier parte de la ventana");

		add(lblCoordenadas);

		addMouseListener(this);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo10MouseListener();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		lblCoordenadas.setText("(" + e.getX() + ", " + e.getY() + "); Botón: " + e.getButton());
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}
