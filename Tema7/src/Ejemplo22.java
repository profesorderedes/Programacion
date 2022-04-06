import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo22 extends JFrame implements ActionListener {

	private JButton btnPlay, btnPause, btnStop;
	private JLabel lblPulsado;

	public Ejemplo22() {

		super("Reproductor");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		btnPlay = new JButton("Play");
		btnPlay.addActionListener(this);

		btnPause = new JButton("Pause");
		btnPause.addActionListener(this);

		btnStop = new JButton("Stop");
		btnStop.addActionListener(this);

		lblPulsado = new JLabel();

		add(btnPlay);
		add(btnPause);
		add(btnStop);
		add(lblPulsado);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo22();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton boton = (JButton) e.getSource();

		if (boton == btnPlay) {
			lblPulsado.setText("Has pulsado Play");
		} else if (boton == btnPause) {
			lblPulsado.setText("Has pulsado Pause");
		} else {
			lblPulsado.setText("Has pulsado Stop");
		}

	}

}
