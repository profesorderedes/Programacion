package hoja2;

public class Ejer11 {

	public static void main(String[] args) {
		// 11.- Escribe todos los múltiplos de 5 entre 1 y 1000. Utiliza un bucle while
		// y haz que la variable contador se incremente de 5 en 5.

		int i = 5;
		int repeticiones = 1;

		while (i <= 1000) {
			System.out.println("Bucle nº " + repeticiones + " -- " + i);
			i = i + 5;
			repeticiones++;
		}
	}

}
