// Intercambiar dos valores.
package ejemplosArrays;


import java.util.Arrays;

public class Ejemplo08 {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;

		// Intercambiamos los valores de a y b.
		int aux;

		aux = a;
		a = b;
		b = aux;
		
		System.out.println("a = " + a + " y b = " + b);
		
		// Intercambiamos dos valores de un array.
		
		int[] notas = { 8, 4, 5, 9, 7 };
		
		int pos1 = 1; // Valor 4.
		int pos2 = 3; // Valor 9.
		
		aux = notas[pos1]; // Guardamos el 4.
		notas[pos1] = notas[pos2]; // Pasamos el 9 a la posición del 4.
		notas[pos2] = aux; // Guardamos el 4 en la posición del 9.


		System.out.println(Arrays.toString(notas));

	}
}






