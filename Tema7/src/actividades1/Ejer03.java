package actividades1;

import javax.swing.JOptionPane;

public class Ejer03 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, 
				"Se ha detectado un scaneo de red desde "
				+ "la IP 192.168.1.51.",
				"Alerta de seguridad", 
				JOptionPane.WARNING_MESSAGE);

	}
}