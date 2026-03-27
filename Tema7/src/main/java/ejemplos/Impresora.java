package ejemplos;

public class Impresora <T> {
	
	private T dato;

	public Impresora(T dato) {
		this.dato = dato;
	}

	public void imprimir() {
		System.out.println(dato);
	}
}