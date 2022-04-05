package ejemploEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manejador implements ActionListener {

	// Este método se ejecutará automáticamente
	// cada vez que se pulse el botón.
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Bien hecho!!!");

	}

}
