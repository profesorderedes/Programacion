package hoja3;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejer04 extends JFrame {

	public Ejer04() {

		super("Asistente matemático");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		//

		// Aritmetica
		JMenu menuAritmetica = new JMenu("Aritmética");

		JMenuItem itemSuma = new JMenuItem("Suma");
		JMenuItem itemResta = new JMenuItem("Resta");
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

//        boolean timer = false;
//        if (timer) {
//            for (int i = 10; i >= 0; i--) {
//                if (i == 1) {
//                    System.out.println("Closing window...");
//                }
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//                }
//            }
//
//            ventana.dispose();
//            System.out.println("Window closed.");
//        }
	}
}
