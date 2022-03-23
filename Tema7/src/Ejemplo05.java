import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Ejemplo05 extends JFrame {

	public Ejemplo05() {

		super("Términos y condiciones");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JCheckBox chkAceptarTerminos = new JCheckBox("Acepto los términos y condiciones");
		JCheckBox chkAceptarPublicidad = new JCheckBox("Deseo recibir publicidad");

		add(chkAceptarTerminos);
		add(chkAceptarPublicidad);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo05 ejemplo = new Ejemplo05();
	}

}
