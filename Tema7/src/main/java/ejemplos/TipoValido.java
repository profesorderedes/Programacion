package ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Ésta es una clase que hereda de Number e implementa ActionListener
// como ejemplo de una clase que puede aceptar Impresora<>.
// No tiene sentido por sí mismo.
public class TipoValido extends Number implements ActionListener {

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
