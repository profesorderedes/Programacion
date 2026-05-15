package clusterGenerator;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.util.SystemFileChooser.FileNameExtensionFilter;

public class Main extends JFrame {

	private JTextField txtGrupo, txtIPInicial, txtIPFinal;
	private JButton btnGenerarTexto, btnGenerarArchivo;
	private JTextArea txtOutput;

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		super("Cluster Generator");
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);
		setResizable(false);

		try {
			UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido cambiar el LookAndFeel", "Editor",
					JOptionPane.ERROR_MESSAGE);
		}

		txtGrupo = new JTextField(10);
		txtIPInicial = new JTextField(10);
		txtIPFinal = new JTextField(10);

		Dimension buttonSize = new Dimension(150, 30);

		btnGenerarTexto = new JButton("Generar texto");
		btnGenerarTexto.setPreferredSize(buttonSize);
		btnGenerarTexto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				txtOutput.setText(generarTexto());
			}
		});

		btnGenerarArchivo = new JButton("Generar archivo");
		btnGenerarArchivo.setPreferredSize(buttonSize);
		btnGenerarArchivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				generarArchivo();
			}
		});

		Dimension textPanelSize = new Dimension(160, 60);

		JPanel pnlGrupo = new JPanel();
		pnlGrupo.setPreferredSize(textPanelSize);
		pnlGrupo.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlGrupo.add(new JLabel("Grupo"));
		pnlGrupo.add(txtGrupo);

		JPanel pnlIPInicial = new JPanel();
		pnlIPInicial.setPreferredSize(textPanelSize);
		pnlIPInicial.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlIPInicial.add(new JLabel("IP Inicial"));
		pnlIPInicial.add(txtIPInicial);

		JPanel pnlIPFinal = new JPanel();
		pnlIPFinal.setPreferredSize(textPanelSize);
		pnlIPFinal.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlIPFinal.add(new JLabel("IP Final"));
		pnlIPFinal.add(txtIPFinal);

		JPanel pnlTextos = new JPanel();

		pnlTextos.add(pnlGrupo);
		pnlTextos.add(pnlIPInicial);
		pnlTextos.add(pnlIPFinal);

		add(pnlTextos);

		JPanel pnlBotones = new JPanel();
		pnlBotones.add(btnGenerarTexto);
		pnlBotones.add(btnGenerarArchivo);

		add(pnlBotones);

		txtOutput = new JTextArea();
		txtOutput.setPreferredSize(new Dimension(585, 280));
		txtOutput.setLineWrap(true);
		JScrollPane scrOutput = new JScrollPane(txtOutput);

		add(scrOutput);

		setVisible(true);
	}

	private String generarTexto() {

		if (!comprobarValores()) {
			return "";
		}

		String grupo = txtGrupo.getText().trim();
		String ipInicial = txtIPInicial.getText().trim();
		String ipFinal = txtIPFinal.getText().trim();

		int posUltimoPunto = ipInicial.lastIndexOf(".") + 1;

		String subred = ipInicial.substring(0, posUltimoPunto);

		int hostInicial = Integer.parseInt(ipInicial.substring(posUltimoPunto));
		int hostFinal = Integer.parseInt(ipFinal.substring(posUltimoPunto));

		String output = grupo + " ";

		for (int i = hostInicial; i <= hostFinal; i++) {
			output += subred + i + " ";
		}

		return output;
	}

	private void generarArchivo() {

		String cluster = generarTexto();
		if (cluster.equals("")) {
			return;
		}

		JFileChooser elegirArchivo = new JFileChooser(System.getProperty("user.home"));

		int resultado = elegirArchivo.showSaveDialog(null);

		if (resultado != JFileChooser.APPROVE_OPTION) {
			return;
		}

		File archivo = elegirArchivo.getSelectedFile();

		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo));

			buffer.write(cluster);

			buffer.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al guardar el cluster", "Error de E/S",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	private boolean comprobarValores() {

		String grupo = txtGrupo.getText().trim();
		String ipInicial = txtIPInicial.getText().trim();
		String ipFinal = txtIPFinal.getText().trim();

		// Comprobamos que todas las casillas hayan sido rellenadas.
		if (grupo.equals("") || ipInicial.equals("") || ipFinal.equals("")) {
			JOptionPane.showMessageDialog(null, "Comprueba que todos los campos estén rellenados", "Cluster generator",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		// Comprobamos que las IPs estén formadas por cuatro campos separados por
		// puntos.

		String[] arrayIpInicial = ipInicial.split("\\.");
		String[] arrayIpFinal = ipFinal.split("\\.");

		if (arrayIpInicial.length != 4 || arrayIpFinal.length != 4) {
			JOptionPane.showMessageDialog(null,
					"Comprueba que los campos de IP sean 4 numeros separados por \".\" (ejemplo: 192.168.1.1)",
					"Cluster generator", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		// Comprobamos que las IPs están formadas por números enteros separados por
		// puntos.

		int[] intArrayIpInicial = new int[4];
		int[] intArrayIpFinal = new int[4];

		try {
			for (int i = 0; i < 4; i++) {
				intArrayIpInicial[i] = Integer.parseInt(arrayIpInicial[i]);
				intArrayIpFinal[i] = Integer.parseInt(arrayIpFinal[i]);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Comprueba que los campos de IP sean válidos (ejemplo: 192.168.1.1)",
					"Cluster generator", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		// Comprobamos que todos los números que forman las IPs están entre 1 y 254
		// (ambos inclusive).

		for (int i = 0; i < 4; i++) {

			int intIpInicial = intArrayIpInicial[i];
			int intIpFinal = intArrayIpFinal[i];

			if (intIpInicial > 254 || intIpInicial < 1 || intIpFinal > 254 || intIpFinal < 1) {

				JOptionPane.showMessageDialog(null, "Comprueba que los valores de los campos de IP estén entre 0 y 255",
						"Cluster generator", JOptionPane.ERROR_MESSAGE);
				return false;
			}

		}

		// Comprobamos que la IP final es mayor que la inicial.

		if (intArrayIpInicial[3] >= intArrayIpFinal[3]) {
			JOptionPane.showMessageDialog(null, "Comprueba que el valor inicial sea menor que el valor final",
					"Cluster generator", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		return true;
	}

}