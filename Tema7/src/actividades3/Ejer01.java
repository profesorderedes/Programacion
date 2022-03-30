package actividades3;

import javax.swing.*;
import java.awt.*;

public class Ejer01 extends JFrame {

	public Ejer01() {

		super("Planificador personal");

		setSize(400, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Usamos border Layout para colocar correctamente la bara de herramientas

		setLayout(new BorderLayout());

		ImageIcon imgFoil = new ImageIcon("iconos/1.png");
		ImageIcon imgStat = new ImageIcon("iconos/11.png");
		ImageIcon imgSave = new ImageIcon("iconos/22.png");
		ImageIcon imgLamp = new ImageIcon("iconos/3.png");
		ImageIcon imgCalendar = new ImageIcon("iconos/44.png");
		ImageIcon imgCam = new ImageIcon("iconos/66.png");
		ImageIcon imgTV = new ImageIcon("iconos/67.png");
		ImageIcon imgTool = new ImageIcon("iconos/73.png");

		// Botones para la barra de heramientas.

		JButton btnFoil = new JButton(imgFoil);
		JButton btnStat = new JButton(imgStat);
		JButton btnSave = new JButton(imgSave);
		JButton btnLamp = new JButton(imgLamp);
		JButton btnCalendar = new JButton(imgCalendar);
		JButton btnCam = new JButton(imgCam);
		JButton btnTV = new JButton(imgTV);
		JButton btnTool = new JButton(imgTool);

		// Barra de herramientras.

		JToolBar barraHerramientas = new JToolBar();

		barraHerramientas.add(btnFoil);
		barraHerramientas.add(btnStat);
		barraHerramientas.add(btnSave);
		barraHerramientas.add(btnLamp);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnCalendar);
		barraHerramientas.add(btnCam);
		barraHerramientas.add(btnTV);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnTool);

		// Añadimos controles a la ventana.

		add(barraHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer01();

	}

}