import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;

public class Ejemplo15 extends JFrame {
	
	public Ejemplo15() {
		
		super("Compilando");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblCompilar = new JLabel("Estado de la compilación:");
		
		JProgressBar prgCompilar = new JProgressBar(0, 1000);
		prgCompilar.setValue(33);
		prgCompilar.setStringPainted(true);
		
		prgCompilar.setPreferredSize(new Dimension(300,25));
		
		add(lblCompilar);
		add(prgCompilar);
		
		setVisible(true);
		
		for(int i = 0; i <= 1000; i++) {
			prgCompilar.setValue(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Ejemplo15();
	}

}
