package examen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer1 extends JFrame{
	
	private int indiceImagen = 0;
	
	public Ejer1() {
		
		super("Fotografías");
		setSize(480,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		ImageIcon foto1 = new ImageIcon("imgs/foto1.png");
		ImageIcon foto2 = new ImageIcon("imgs/foto2.png");
		ImageIcon foto3 = new ImageIcon("imgs/foto3.png");
		ImageIcon foto4 = new ImageIcon("imgs/foto4.png");
		ImageIcon foto5 = new ImageIcon("imgs/foto5.png");
		ImageIcon foto6 = new ImageIcon("imgs/foto6.png");
		
		ImageIcon iconos[] = {foto1, foto2, foto3, foto4, 
				foto5, foto6};
		
		JLabel lblImagen = new JLabel(foto1);
		
		JButton btnSiguiente = new JButton(">>");
		btnSiguiente.setBackground(Color.GREEN);
		btnSiguiente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				indiceImagen++;
				if(indiceImagen == iconos.length) {
					indiceImagen = 0;
				}
				
				lblImagen.setIcon(iconos[indiceImagen]);
				
			}
		});
		
		add(lblImagen, BorderLayout.CENTER);
		add(btnSiguiente, BorderLayout.EAST);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejer1();
	}

}
