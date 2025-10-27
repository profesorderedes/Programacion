package hoja2;

public class Ejer22 {

	public static void main(String[] args) {

		// 22.- Escribe una aplicación que muestre las tablas de multiplicar del 1 al
		// 10.

		for (int base = 1; base <= 10; base++) {

			System.out.println("\nTabla del: " + base);
			
			for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

				System.out.println(base + " x " + multiplicador + " = " + base * multiplicador);
			}
		}
	}
}