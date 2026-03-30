package ejemplos;

import java.awt.event.ActionListener;

public class Impresora<T extends Number & ActionListener> {

	private T dato;

	public Impresora(T dato) {
		this.dato = dato;
	}

	public void imprimir() {
		System.out.println(dato);
	}
}