package ejemplos;

public class Ejemplo02 {

	public static void main(String[] args) {

		// Llamamos al método mostrar y le pasamos como argumento la cadena "Hola,
		// mundo!". Este dato se copia en el parámetro frase del método.
		mostrar("Hola, mundo!");

		doble(4);

		triple(10);

		tablaMultiplicar(7);

	}

	// Este método recibe un argumento (frase) de tipo String. Su valor es lo que
	// hay entre paréntesis cuando se le ha llamado.
	static void mostrar(String frase) {

		System.out.println(frase);

	}

	static void doble(int num) {

		int numDoble = num * 2;
		System.out.println("El doble de " + num + " es " + numDoble);

	}

	static void triple(int num) {

		System.out.println("El triple de " + num + " es " + 3 * num);

	}

	static void tablaMultiplicar(int valor) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(valor + " * " + i + " = " + (valor * i));

		}

	}

}
