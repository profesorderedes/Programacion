package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo08 extends JFrame {

	public Ejemplo08() {
		super("Comentarios");
		setSize(400, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		try {
			
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el lookandfeel.");
		}

		JLabel lblProfesion = new JLabel("Indica tu profesión:");

		JComboBox<String> cmbProfesion = new JComboBox<>();

		cmbProfesion.addItem("Estudiante");
		cmbProfesion.addItem("Programador");
		cmbProfesion.addItem("Diseñador");

		JLabel lblComentario = new JLabel("Deja tu comentario:                        ");

		JTextArea txtComentario = new JTextArea();
		txtComentario.setLineWrap(true);
		txtComentario.setWrapStyleWord(true);

		JScrollPane scrComentario = new JScrollPane(txtComentario);

		scrComentario.setPreferredSize(new Dimension(390, 220));

		JButton btnAceptar = new JButton("Aceptar");
		JButton btnCancelar = new JButton("Cancelar");

		add(lblProfesion);
		add(cmbProfesion);
		add(lblComentario);
		add(scrComentario);
		add(btnAceptar);
		add(btnCancelar);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo08 plantilla = new Ejemplo08();
	}

}
