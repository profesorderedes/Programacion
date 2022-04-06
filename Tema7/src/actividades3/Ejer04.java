package actividades3;

import javax.swing.*;
import java.awt.*;

public class Ejer04 extends JFrame {

	public Ejer04() {

		super("Asistente matematico");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JMenuBar barraMenu = new JMenuBar();

		JMenu menuAritmetica = new JMenu("Aritmetica");
		JMenuItem itemSuma = new JMenuItem("Suma");
		JMenuItem itemResta = new JMenuItem("Resta");
		JMenuItem itemMultiplicacion = new JMenuItem("Multiplicacion");
		JMenuItem itemDivision = new JMenuItem("Division");
		JMenuItem itemPorcentaje = new JMenuItem("Porcentaje");
		menuAritmetica.add(itemSuma);
		menuAritmetica.add(itemResta);
		menuAritmetica.addSeparator();
		menuAritmetica.add(itemMultiplicacion);
		menuAritmetica.add(itemDivision);
		menuAritmetica.addSeparator();
		menuAritmetica.add(itemPorcentaje);

		JMenu menuCalculo = new JMenu("Calculo");
		JMenuItem itemDerivada = new JMenuItem("Derivada");
		JMenuItem itemIntegral = new JMenuItem("Integral");
		JMenuItem itemPolinomio = new JMenuItem("Polinomio de Taylor");
		JMenuItem itemEcuacion = new JMenuItem("Ecuacion diferencial");
		menuCalculo.add(itemDerivada);
		menuCalculo.add(itemIntegral);
		menuCalculo.addSeparator();
		menuCalculo.add(itemPolinomio);
		menuCalculo.add(itemEcuacion);
		

		barraMenu.add(menuAritmetica);
		barraMenu.add(menuCalculo);

		setJMenuBar(barraMenu);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer04();
	}

}