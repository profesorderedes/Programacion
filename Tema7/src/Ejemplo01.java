import javax.swing.JFrame;

public class Ejemplo01 extends JFrame {

	public Ejemplo01() {

		super("Primera ventana");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo01 ejemplo = new Ejemplo01();
	}

}
