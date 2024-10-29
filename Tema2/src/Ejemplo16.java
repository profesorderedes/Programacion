
public class Ejemplo16 {

	public static void main(String[] args) {

		System.out.println("Números aleatorios mayores o iguales a 0 y menores que 1:");
		int i = 1;
		while (i <= 5) {
			System.out.println(Math.random());
			i++;
		}

		System.out.println("\nNúmeros aleatorios mayores o iguales a 0 y menores que 2:");

		i = 1;
		while (i <= 5) {
			System.out.println(2 * Math.random());
			i++;
		}

		System.out.println("\nNúmeros aleatorios mayores o iguales a 1 y menores que 3:");

		i = 1;
		while (i <= 5) {
			System.out.println(2 * Math.random() + 1);
			i++;
		}

		System.out.println("\nNúmeros aleatorios enteros entre 1 y 2 (ambos inclusive):");

		i = 1;
		while (i <= 5) {
			System.out.println((int) (2 * Math.random() + 1));
			i++;
		}

	}

}
