package hoja3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Planificador personal");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		BorderLayout layout = new BorderLayout();
		setLayout(layout);

		ImageIcon icnNuevo = new ImageIcon("iconos/1.png");
		JButton btnNuevo = new JButton(icnNuevo);

		ImageIcon icnGrafico = new ImageIcon("iconos/11.png");
		JButton btnGrafico = new JButton(icnGrafico);

		ImageIcon icnGuardar = new ImageIcon("iconos/22.png");
		JButton btnGuardar = new JButton(icnGuardar);

		ImageIcon icnAyuda = new ImageIcon("iconos/3.png");
		JButton btnAyuda = new JButton(icnAyuda);

		ImageIcon icnCalendario = new ImageIcon("iconos/44.png");
		JButton btnCalendario = new JButton(icnCalendario);

		ImageIcon icnCamara = new ImageIcon("iconos/66.png");
		JButton btnCamara = new JButton(icnCamara);

		ImageIcon icnPantalla = new ImageIcon("iconos/67.png");
		JButton btnPantalla = new JButton(icnPantalla);

		ImageIcon icnAjustes = new ImageIcon("iconos/73.png");
		JButton btnAjustes = new JButton(icnAjustes);

		JToolBar tlbBarra = new JToolBar();

		tlbBarra.add(btnNuevo);
		tlbBarra.add(btnGrafico);
		tlbBarra.add(btnGuardar);
		tlbBarra.add(btnAyuda);
		tlbBarra.addSeparator();
		tlbBarra.add(btnCalendario);
		tlbBarra.add(btnCamara);
		tlbBarra.add(btnPantalla);
		tlbBarra.addSeparator();
		tlbBarra.add(btnAjustes);

		add("North", tlbBarra);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer01 ventana = new Ejer01();

	}
}