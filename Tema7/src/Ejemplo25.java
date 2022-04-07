import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo25 extends JFrame implements KeyListener{

	private JLabel lblTele;
	private int x, y; // Coordenadas

	public Ejemplo25() {

		super("Star TV");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(null);

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		ImageIcon imgTele = new ImageIcon("iconos/67.png");

		lblTele = new JLabel(imgTele);

		add(lblTele);

		x = 50;
		y = 50;
		lblTele.setBounds(x, y, 24, 24);
		
		// Asignamos el KeyListener a toda la ventana, ya
		// que las pulsaciones las va a recibir el JFrame.
		addKeyListener(this);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo25();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		char tecla = e.getKeyChar();
		if(tecla == 'a') {
			x = x - 5;
		}else if(tecla == 'd') {
			x = x + 5;
		}else if(tecla == 's') {
			y = y + 5;
		}else if(tecla == 'w') {
			y = y - 5;
		}
		
		lblTele.setBounds(x,y,24,24);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
