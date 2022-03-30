package actividades1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer04 extends JFrame {

	public static void main(String[] args) {

		String[] series = {"Futurama","Los Simpson","Heroes"};
		
		JOptionPane.showOptionDialog(null, 
				"Haz click en tu serie favorita", 
				"Elección de Serie", 0, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, series, series[2]);	
		
	}

}