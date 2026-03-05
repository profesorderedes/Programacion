package hoja3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Ejer04 extends JFrame implements ActionListener {

	private JMenuItem itemSuma, itemResta;

	public Ejer04() {

		super("Asistente matemático");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		//

		// Aritmética
		JMenu menuAritmetica = new JMenu("Aritmética");

		itemSuma = new JMenuItem("Suma");
		itemSuma.addActionListener(this);

		itemResta = new JMenuItem("Resta");
		itemResta.addActionListener(this);

		JMenuItem itemMultiplicacion = new JMenuItem("Multiplicación");
		JMenuItem itemDivision = new JMenuItem("División");
		JMenuItem itemPorcentaje = new JMenuItem("Porcentaje");

		menuAritmetica.add(itemSuma);
		menuAritmetica.add(itemResta);
		menuAritmetica.addSeparator();
		menuAritmetica.add(itemMultiplicacion);
		menuAritmetica.add(itemDivision);
		menuAritmetica.addSeparator();
		menuAritmetica.add(itemPorcentaje);

		// Calculo
		JMenu menuCalculo = new JMenu("Cálculo");

		JMenuItem itemDerivada = new JMenuItem("Derivada");
		JMenuItem itemIntegral = new JMenuItem("Integral");
		JMenuItem itemPolinomioTaylor = new JMenuItem("Polinomio de Taylor");
		JMenuItem itemEcuacionDif = new JMenuItem("Ecuación diferencial");

		menuCalculo.add(itemDerivada);
		menuCalculo.add(itemIntegral);
		menuCalculo.addSeparator();
		menuCalculo.add(itemPolinomioTaylor);
		menuCalculo.add(itemEcuacionDif);

		JMenuBar barraMenu = new JMenuBar();

		barraMenu.add(menuAritmetica);
		barraMenu.add(menuCalculo);

		setJMenuBar(barraMenu);

		//
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer04 ventana = new Ejer04();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == itemSuma) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la operación Suma.", "Asistente matemático",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (e.getSource() == itemResta) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la operación Resta.", "Asistente matemático",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
