package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejercicio06 extends JFrame {

	private JTextArea txtArea;
	private JFileChooser elegirArchivo = new JFileChooser();
	private JLabel lblNombreArchivo;
	private File archivo;

	public Ejercicio06() {
		super("Editor");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido cambiar el LookAndFeel", "Editor",
					JOptionPane.ERROR_MESSAGE);
		}

		setLocationRelativeTo(null);

		// Una barra de herramientas

		JMenuItem menuOpenFile = new JMenuItem("Open File");
		menuOpenFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				abrirArchivo();
			}
		});

		JMenuItem menuSaveFile = new JMenuItem("Save");
		menuSaveFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				guardarArchivo();
			}
		});

		JMenu fileMenu = new JMenu("File");

		fileMenu.add(menuOpenFile);
		fileMenu.add(menuSaveFile);

		JMenuBar barraMenu = new JMenuBar();

		barraMenu.add(fileMenu);

		setJMenuBar(barraMenu);

		lblNombreArchivo = new JLabel();

		add(lblNombreArchivo);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejercicio06();
	}

	private void abrirArchivo() {

		int resultado = elegirArchivo.showOpenDialog(this);

		if (resultado != JFileChooser.APPROVE_OPTION) {
			return;
		}

		archivo = elegirArchivo.getSelectedFile();

		lblNombreArchivo.setText(archivo.toString());

	}

	private void guardarArchivo() {

		int resultado = elegirArchivo.showSaveDialog(this);

		if (resultado != JFileChooser.APPROVE_OPTION) {
			return;
		}

		archivo = elegirArchivo.getSelectedFile();

		lblNombreArchivo.setText(archivo.toString());
	}
}