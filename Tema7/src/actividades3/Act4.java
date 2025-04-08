package actividades3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Act4 extends JFrame implements ActionListener {

	private JMenuItem itmSuma;

	public Act4() {

		super("Asistente matemático");
		setSize(350, 180);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		// Menu Aritmetica.
		JMenu menuAritmetica = new JMenu("Aritmetica");

		itmSuma = new JMenuItem("Suma");
		itmSuma.addActionListener(this);
		JMenuItem itmResta = new JMenuItem("Resta");
		JMenuItem itmMultiplicacion = new JMenuItem("Multiplicación");
		JMenuItem itmDivision = new JMenuItem("División");
		JMenuItem itmPorcentaje = new JMenuItem("Porcentaje");

		menuAritmetica.add(itmSuma);
		menuAritmetica.add(itmResta);
		menuAritmetica.addSeparator();
		menuAritmetica.add(itmMultiplicacion);
		menuAritmetica.add(itmDivision);
		menuAritmetica.addSeparator();
		menuAritmetica.add(itmPorcentaje);

		// Menu Calculo.
		JMenu menuCalculo = new JMenu("Cálculo");

		JMenuItem itmDerivada = new JMenuItem("Derivada");
		JMenuItem itmIntegral = new JMenuItem("Integral");
		JMenuItem itmPolinomioTaylor = new JMenuItem("Polinomio de Taylor");
		JMenuItem itmEquacionDiferencial = new JMenuItem("Ecuacion diferencial");

		menuCalculo.add(itmDerivada);
		menuCalculo.add(itmIntegral);
		menuCalculo.addSeparator();
		menuCalculo.add(itmPolinomioTaylor);
		menuCalculo.add(itmEquacionDiferencial);

		// Barra de Menus.
		JMenuBar barraMenus = new JMenuBar();

		barraMenus.add(menuAritmetica);
		barraMenus.add(menuCalculo);

		setJMenuBar(barraMenus);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Act4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JMenuItem itemPulsado = (JMenuItem) e.getSource();

		if (itemPulsado == itmSuma) {
			System.out.println("Has clicado en Suma.");
		}

	}

}