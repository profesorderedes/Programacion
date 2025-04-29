
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Paleta extends JFrame implements ChangeListener {

	private JSlider sldRojo;
	private JSlider sldVerde;
	private JSlider sldAzul;
	private JButton btnColores;
	private JTextField txtColores;

	public Paleta() {
		super("Paleta");
		setSize(220, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblRojo = new JLabel("Rojo");
		sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 250);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);
		sldRojo.addChangeListener(this);

		JLabel lblVerde = new JLabel("Verde");
		sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);
		sldVerde.addChangeListener(this);

		JLabel lblAzul = new JLabel("Azul");
		sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 51);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);
		sldAzul.addChangeListener(this);

		btnColores = new JButton();
		btnColores.setPreferredSize(new Dimension(100, 25));
		btnColores.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
		btnColores.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard portapapeles = Toolkit.getDefaultToolkit().getSystemClipboard();
				StringSelection seleccion = new StringSelection(txtColores.getText());
				portapapeles.setContents(seleccion, null);
			}
		});
		txtColores = new JTextField("#FFC833", 7);

		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColores);
		add(txtColores);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Paleta();
	}

	@Override
	public void stateChanged(ChangeEvent e) {

		int rojo = sldRojo.getValue();
		int verde = sldVerde.getValue();
		int azul = sldAzul.getValue();

		btnColores.setBackground(new Color(rojo, verde, azul));
		txtColores.setText("#" + aHexadecimal(rojo) + aHexadecimal(verde) + aHexadecimal(azul));

	}

	private String aHexadecimal(int num) {

		String[] caracteresHex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

		int division = num / 16;
		int resto = num % 16;

		String divisionCadena = caracteresHex[division];
		String restoCadena = caracteresHex[resto];

		return divisionCadena + restoCadena;

	}
}
