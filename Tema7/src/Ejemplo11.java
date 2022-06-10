import javax.swing.*;
import java.awt.*;

public class Ejemplo11 extends JFrame {

	public Ejemplo11() {

		super("Volumen");
		setSize(200, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JSlider sldVolumen = new JSlider(JSlider.HORIZONTAL, 0, 20, 7);

		sldVolumen.setPaintTicks(true);
		sldVolumen.setPaintLabels(true);
		sldVolumen.setMinorTickSpacing(2);
		sldVolumen.setMajorTickSpacing(10);

		add(sldVolumen);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo11();
	}

}
