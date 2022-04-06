import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo23 extends JFrame implements FocusListener{

	private JTextField txtNum1, txtNum2, txtNum3;
	private JLabel lblMedia;

	public Ejemplo23() {

		super("Promedios");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		txtNum1 = new JTextField("0", 7);
		txtNum1.addFocusListener(this);
		
		txtNum2 = new JTextField("0", 7);
		txtNum2.addFocusListener(this);
		
		txtNum3 = new JTextField("0", 7);
		txtNum3.addFocusListener(this);
		
		lblMedia = new JLabel("La media es 0.0");

		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(lblMedia);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo23();
	}

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("Foco ganado.");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("Foco perdido.");
	}

}
