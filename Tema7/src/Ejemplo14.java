import javax.swing.*;
import java.awt.*;

public class Ejemplo14 extends JFrame {
	
	public Ejemplo14() {
		
		super("Menús");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		String[] comidas = {"Pizza Margarita", 
				"Pizza Cuatro estaciones", "Pizza Carbonara", 
				"Wok de verdura", "Macarrones Boloñesa", 
				"Calzone Barbacoa", "Spaghetti al Pesto", 
				"Big Mac", "Ñoqis", "Durum"};
		
		JList<String> lstComidas = new JList<>(comidas);
		
		JScrollPane panelComidas = new JScrollPane(lstComidas);
		
		add(panelComidas);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo14();
	}

}
