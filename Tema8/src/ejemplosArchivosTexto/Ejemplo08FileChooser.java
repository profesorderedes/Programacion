package ejemplosArchivosTexto;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo08FileChooser extends JFrame {

	public Ejemplo08FileChooser() {

		super("Elegir un archivo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);
		
		
		JButton btnElegirArchivo = new JButton("Elegir un archivo");
		btnElegirArchivo.setPreferredSize(new Dimension(150,30));
		btnElegirArchivo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser elegir = new JFileChooser();
				
				int eleccion = elegir.showOpenDialog(null);
				
				if(eleccion == JFileChooser.APPROVE_OPTION) {
					System.out.println(elegir.getSelectedFile().toString());
					File archivo = elegir.getSelectedFile();
					
					try {
						FileReader fichero = new FileReader(archivo);
						BufferedReader buffer = new BufferedReader(fichero);
						
						String linea = buffer.readLine();
						while(linea != null) {
							
							System.out.println(linea);
							linea = buffer.readLine();
							
						}
						
						buffer.close();
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}else {
					System.out.println("Se ha cancelado.");
				}
				
			}
		});
		
		JLabel lblRutaArchivo = new JLabel();
			
		add(btnElegirArchivo);
		add(lblRutaArchivo);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo08FileChooser();
	}

}
