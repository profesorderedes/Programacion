import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo22 extends JFrame 
	implements ActionListener{

	private JButton btnPlay, btnPause, btnStop;
	
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
		
		add(btnPlay);
		add(btnPause);
		add(btnStop);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo22();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton boton =(JButton) e.getSource();
		
		if(boton == btnPlay) {
			System.out.println("Has pulsado Play");
		} else if(boton == btnPause) {
			System.out.println("Has pulsado Pause");
		}else {
			System.out.println("Has pulsado Stop");
		}
		
	}

}
