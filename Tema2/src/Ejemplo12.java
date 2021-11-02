

import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un precio: ");
		float precio = entrada.nextFloat();

		float precioFinal = precio;
		if (precio > 80) {
			precioFinal = precio - precio * 10 / 100;
		}
		
		// Operador ternario equivalente al if de arriba.
		
		
		
		

		System.out.println("Precio final: " + precioFinal);

		
		
		
		
		
		
		
		
	}
}