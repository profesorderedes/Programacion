import javax.swing.*;
import java.awt.*;

public class Ejemplo06 extends JFrame {

	public Ejemplo06() {

		super("Países");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		try {
			UIManager.setLookAndFeel(
					"javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | 
				InstantiationException | 
				IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al aplicar el look "
					+ "and feel del sistema.");
		}
		
		JLabel lblPaises = new JLabel("Indica tu país:");

		// Creamos un array de String con los países.
		String[] paises = {"España", "Francia", "Italia", 
				"Portugal", "Rumanía"};
		
		JComboBox<String> cmbPaises = new JComboBox<>(paises);
		
		// Creamos un objeto Dimension para dar tamaño al 
		// ComboBox.
		Dimension tamanyo = new Dimension(250,20);
		cmbPaises.setPreferredSize(tamanyo);
		
		JLabel lblComentario = new JLabel("Escribe un "
				+ "comentario:");
		JTextArea txtComentario = new JTextArea();
		
		// Creamos un JScrollPane para que el TextArea
		// funcione bien.
		JScrollPane panelComentario = new JScrollPane(
				txtComentario);
		panelComentario.setPreferredSize(
				new Dimension(250,100));
		
		JButton btnEnviar = new JButton("Enviar");
		
		add(lblPaises);
		add(cmbPaises);
		add(lblComentario);
		add(panelComentario);
		add(btnEnviar);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo06 ejemplo = new Ejemplo06();
	}

}
