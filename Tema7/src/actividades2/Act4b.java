package actividades2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Act4b extends JFrame {

	public Act4b() {

		super("Suscripción");
		setSize(275, 370);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		JToolBar tlbMenu = new JToolBar();

		JButton btnIcono1 = new JButton(new ImageIcon("iconos/5.png"));
		JButton btnIcono2 = new JButton(new ImageIcon("iconos/6.png"));
		JButton btnIcono3 = new JButton(new ImageIcon("iconos/7.png"));
		JButton btnIcono4 = new JButton(new ImageIcon("iconos/8.png"));
		JButton btnIcono5 = new JButton(new ImageIcon("iconos/9.png"));
		JButton btnIcono6 = new JButton(new ImageIcon("iconos/10.png"));

		tlbMenu.add(btnIcono1);
		tlbMenu.add(btnIcono2);
		tlbMenu.add(btnIcono3);
		tlbMenu.addSeparator();
		tlbMenu.add(btnIcono4);
		tlbMenu.add(btnIcono5);
		tlbMenu.add(btnIcono6);

		JPanel panelContenido = new JPanel();
		panelContenido.setLayout(new FlowLayout());

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(23);

		JLabel lblEmail = new JLabel("Email");
		JTextField txtEmail = new JTextField(23);

		JLabel lblMotivo = new JLabel("Motivo por el que te suscribes");
		JTextArea txtMotivo = new JTextArea();

		JScrollPane pnlMotivo = new JScrollPane(txtMotivo);

		JCheckBox chckInfo = new JCheckBox("Recibir información por correo", true);

		JButton btnEnviar = new JButton("Enviar");

		pnlMotivo.setPreferredSize(new Dimension(258, 100));

		panelContenido.add(lblNombre);
		panelContenido.add(txtNombre);
		panelContenido.add(lblEmail);
		panelContenido.add(txtEmail);
		panelContenido.add(lblMotivo);
		panelContenido.add(pnlMotivo);
		panelContenido.add(chckInfo);
		panelContenido.add(btnEnviar);

		add(tlbMenu, BorderLayout.NORTH);
		add(panelContenido, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Act4b();
	}

}