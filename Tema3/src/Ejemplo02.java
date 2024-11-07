
public class Ejemplo02 {

	public static void main(String[] args) {

		// Declaramos e inicializamos algunos arrays.

		int[] notas = { 10, 5, 7, 8, 9, 9, 7, 6, 5, 5 };

		String[] nombres = { "Pepe", "María", "Juana" };

		// Recorremos los arrays con bucles.
		
		for(int i = 0; i<=9; i++) {
			System.out.println(notas[i]);
		}
		
		// Tamaño de un array (cantidad de elementos que tiene).
		
		System.out.println("\nTamaño del array notas: " + notas.length);
		System.out.println("\nTamaño del array nombres: " + nombres.length);
		
		// Recorremos los arrays usando la propiedad length.
		
		System.out.println();
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
	}

}














