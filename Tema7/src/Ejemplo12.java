import javax.swing.*;
import java.awt.*;

public class Ejemplo12 extends JFrame {
	
	public Ejemplo12() {
		
		super("Comentario adicional");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblComentario = new JLabel(
				"Escribe tu comentario...");
		
		JTextArea txtComentario = new JTextArea();
		
		JScrollPane panelComentario = 
				new JScrollPane(txtComentario);
		panelComentario.setPreferredSize(
				new Dimension(390,220));
		
		add(lblComentario);
		add(panelComentario);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo12();
	}

}
