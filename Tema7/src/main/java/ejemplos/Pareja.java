package ejemplos;

public class Pareja<T, U> {

	private T dato1;
	private U dato2;

	public Pareja(T dato1, U dato2) {
		this.dato1 = dato1;
		this.dato2 = dato2;
	}

	public void mostrar() {
		System.out.println(dato1 + " - " + dato2);
	}

}
