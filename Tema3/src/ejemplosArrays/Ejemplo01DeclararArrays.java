package ejemplosArrays;

public class Ejemplo01DeclararArrays {

	public static void main(String[] args) {

		// Declaramos un par de arrays.

		// El primer array lo declaramos y lo inicializamos de una sola vez.
		double[] precios = { 12, 102, 20.5, 50, 75 };

		// El segundo array lo declaramos y lo inicializamos con valores por defecto.
		// Como es un array de números, el valor por defecto de cada posición será 0.
		double[] precios2 = new double[5];

		// Accedemos a algunas posiciones del array para modificarlas.
		precios[0] = 20; // Guardamos en la primera posición el valor 20.
		precios[4] = 5;

		// Leemos una posición y mostramos su valor.
		System.out.println("En la posición 0 tenemos el precio " + precios[0] + " euros.");
		System.out.println("En la posición 0 del array precios2 tenemos el valor " + precios2[0]);

	}

}
