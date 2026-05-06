package ejemplos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo13 extends JFrame {

	private JTextArea txtTexto;
	private JFileChooser elegirArchivo = new JFileChooser();
	private String archivo;

	public Ejemplo13() {

		super("Editor");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		try {
			// UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			UIManager.setLookAndFeel("com.formdev.flatlaf.themes.FlatMacLightLaf");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			JOptionPane.showMessageDialog(this, "No se ha podido cambiar el look and feel.", "Editor",
					JOptionPane.ERROR_MESSAGE);
		}

		// Barra de herramientas.

		JButton btnAbrir = new JButton(new ImageIcon("iconos/52.png"));
		btnAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				abrirArchivo();
			}
		});

		JButton btnGuardar = new JButton(new ImageIcon("iconos/22.png"));
		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				guardarArchivo();
			}
		});

		JToolBar barraHerramientas = new JToolBar();

		barraHerramientas.add(btnAbrir);
		barraHerramientas.add(btnGuardar);

		// TextArea en el centro del BorderLayout.
		txtTexto = new JTextArea();
		JScrollPane scrTexto = new JScrollPane(txtTexto);

		// Ventana general.

		add(barraHerramientas, BorderLayout.NORTH);
		add(scrTexto, BorderLayout.CENTER);

		setVisible(true);

	}

	private void abrirArchivo() {

		// Abrimos el JFileChooser para elegir un archivo.

		int resultado = elegirArchivo.showOpenDialog(this);

		if (resultado != JFileChooser.APPROVE_OPTION) {
			return;
		}

		archivo = elegirArchivo.getSelectedFile().toString();

		try {

			// Abrimos en modo lectura el archivo elegido.
			BufferedReader buffer = new BufferedReader(new FileReader(archivo));

			// Mostramos las líneas de texto del archivo en el TextArea.
			String linea = buffer.readLine();
			String contenidoArchivo = "";

			while (linea != null) {

				contenidoArchivo += linea + "\n";
				linea = buffer.readLine();

			}

			txtTexto.setText(contenidoArchivo);

			// Cerramos el archivo.
			buffer.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(this, "Archivo no encontrado.", "Editor", JOptionPane.ERROR_MESSAGE);
			return;
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Error al leer el archivo.", "Editor", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		setTitle("Editor - " + archivo);

	}

	private void guardarArchivo() {

		if (archivo == null) {

			int resultado = elegirArchivo.showSaveDialog(this);

			if (resultado != JFileChooser.APPROVE_OPTION) {
				return;
			}

		}

		archivo = elegirArchivo.getSelectedFile().toString();

		try {

			BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo));

			buffer.write(txtTexto.getText());

			buffer.close();

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Error al guardar archivo", "Editor", JOptionPane.ERROR_MESSAGE);

		}

		setTitle("Editor - " + archivo);
		
		JOptionPane.showMessageDialog(null, "Archivo guardado correctamente", "Editor",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void main(String[] args) {
		new Ejemplo13();
	}

}

//@formatter:off






























//@formatter:on