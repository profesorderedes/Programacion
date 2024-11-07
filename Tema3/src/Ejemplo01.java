
public class Ejemplo01 {

	public static void main(String[] args) {

		// Declaramos e inicializamos algunos arrays.

		int[] notas = { 10, 5, 7, 8, 9, 9, 7, 6, 5, 5 };

		String[] nombres = { "Pepe", "María", "Juana" };

		// Accedemos a sus elementos.

		System.out.println("Primera nota: " + notas[0]);
		System.out.println("Tercera nota: " + notas[2]);

		System.out.println("Primer nombre: " + nombres[0]);
		System.out.println("Segundo nombre: " + nombres[1]);

		// Modificamos el contenido de los elementos del array.

		notas[0] = 9;
		notas[1] = 7;
		System.out.println("Primera nota: " + notas[0]);
		System.out.println("Segunda nota: " + notas[1]);

		nombres[0] = "Marta";
		System.out.println("Primer nombre: " + nombres[0]);

	}

}
