package ejemplosMetodos;

public class Ejemplo01 {

	public static void main(String[] args) {

		System.out.println("¡Mayordomo!");

		// Llamamos (invocamos) al método mayordomo. El flujo del programa hace una
		// parada aquí y salta al método. Cuando el contenido del método termina, el
		// programa
		// continúa en la siguiente línea del main().
		mayordomo();

		System.out.println("Un jerez, por favor.");

	}

	public static void mayordomo() {

		System.out.println("¿Qué desea, señor?");

	}

}
