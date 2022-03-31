import javax.swing.*;
import java.awt.*;

public class Ejemplo14 extends JFrame {
	
	public Ejemplo14() {
		
		super("Menús");
		setSize(250,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblComidas = new JLabel("Elige tu menú:");
		
		String[] comidas = {"Pizza Margarita", 
				"Pizza Cuatro estaciones", "Pizza Carbonara", 
				"Wok de verdura", "Macarrones Boloñesa", 
				"Calzone Barbacoa", "Spaghetti al Pesto", 
				"Big Mac", "Ñoqis", "Durum"};
		
		JList<String> lstComidas = new JList<>(comidas);
		
		JScrollPane panelComidas = new JScrollPane(lstComidas);
		
		JButton btnReservar = new JButton("Reservar");
		
		add(lblComidas);
		add(panelComidas);
		add(btnReservar);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo14();
	}

}
