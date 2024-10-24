
public class Ejemplo17 {

	public static void main(String[] args) {

		// Simulación de un dado.

		System.out.println("Números entre 1 y 6:");

		int numAleatorio;
		int i = 1;
		while (i <= 10) {
			numAleatorio = (int) (100000* Math.random());
			System.out.println(numAleatorio);
			i++;
		}

	}
}
