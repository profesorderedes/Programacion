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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejemplo08FileChooser extends JFrame {

	public Ejemplo08FileChooser() {

		super("Elegir un archivo");
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);
		
		JMenuBar barraMenu = new JMenuBar();
		
		JMenu menuArchivo = new JMenu("Archivo");
		
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		menuArchivo.add(itemAbrir);
		
		barraMenu.add(menuArchivo);

		JButton btnElegirArchivo = new JButton("Elegir un archivo");
		btnElegirArchivo.setPreferredSize(new Dimension(150, 30));

		JLabel lblRutaArchivo = new JLabel();
		JTextArea txtTexto = new JTextArea();
		JScrollPane scrTexto = new JScrollPane(txtTexto);
		scrTexto.setPreferredSize(new Dimension(690, 420));

		btnElegirArchivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				JFileChooser elegir = new JFileChooser();

				int eleccion = elegir.showOpenDialog(null);

				if (eleccion == JFileChooser.APPROVE_OPTION) {

					System.out.println(elegir.getSelectedFile().toString());
					File archivo = elegir.getSelectedFile();

					try {
						FileReader fichero = new FileReader(archivo);
						BufferedReader buffer = new BufferedReader(fichero);

						String texto = "";
						String linea = buffer.readLine();
						while (linea != null) {

							texto = texto + linea + "\n";
							linea = buffer.readLine();

						}

						txtTexto.setText(texto);

						buffer.close();

					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("Se ha cancelado.");
				}

			}
		});

		setJMenuBar(barraMenu);
		add(btnElegirArchivo);
		add(lblRutaArchivo);
		add(scrTexto);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo08FileChooser();
	}

}
