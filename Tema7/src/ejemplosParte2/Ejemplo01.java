package ejemplosParte2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo01 extends JFrame {

	public Ejemplo01() {

		super("FlowLayout");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Separamos los componentes 20px en horizontal y 10px 
		// en vertical.
		setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

		setLocationRelativeTo(null);

		JButton btn1 = new JButton("Botón 1");
		JButton btn2 = new JButton("Botón 2");
		JButton btn3 = new JButton("Botón 3");
		JButton btn4 = new JButton("Botón 4");
		JButton btn5 = new JButton("Botón 5");
		JButton btn6 = new JButton("Botón 6");
		JButton btn7 = new JButton("Botón 7");
		JButton btn8 = new JButton("Botón 8");
		JButton btn9 = new JButton("Botón 9");
		JButton btn10 = new JButton("Botón 10");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn10);

		
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo01();
	}

}
