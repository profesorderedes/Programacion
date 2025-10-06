package ejemplos;

public class Ejemplo03NumeroAleatorio {

	public static void main(String[] args) {

		// Tenemos el método Math.random() que nos devuelve un número aleatorio
		// mayor o igual que 0 y menor estrictamente que 1.

		System.out.println(Math.random());

		// Si multiplicamos por 5:
		System.out.println(5 * Math.random());

		// Si sumamos 1:
		System.out.println(5 * Math.random() + 1);

		// Si nos quedamos con la parte entera (truncamos) obtenemos números enteros
		// aleatorios entre 1 y 5:
		System.out.println((int) (5 * Math.random() + 1));

	}

}
