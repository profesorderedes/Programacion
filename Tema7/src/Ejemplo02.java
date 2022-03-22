import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Ejemplo02 extends JFrame{

	public Ejemplo02() {
		
		super("Playback");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		JButton botonPlay = new JButton("Play");
		JButton botonPausa = new JButton("Pausa");
		JButton botonParar = new JButton("Parar");
		
		add(botonPlay);
		add(botonPausa);
		add(botonParar);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Ejemplo02 ejemplo = new Ejemplo02();
	}
	
}
