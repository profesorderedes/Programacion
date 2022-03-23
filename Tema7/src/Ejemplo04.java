import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

public class Ejemplo04 extends JFrame {

	public Ejemplo04() {

		super("Cuestionario");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JRadioButton rdbHombre = new JRadioButton("Hombre", 
				true);
		JRadioButton rdbMujer = new JRadioButton("Mujer");
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbHombre);
		grupo.add(rdbMujer);
		
		add(rdbHombre);
		add(rdbMujer);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo04 ejemplo = new Ejemplo04();
	}

}
