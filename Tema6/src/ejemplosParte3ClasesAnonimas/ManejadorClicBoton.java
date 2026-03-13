package ejemplosParte3ClasesAnonimas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ManejadorClicBoton implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		JOptionPane.showMessageDialog(null, "¡Me has pulsado!", "Pulsación", JOptionPane.INFORMATION_MESSAGE);

	}

}
