
import java.util.Scanner;

public class Ejemplo11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el precio:");
		float precio = entrada.nextFloat();

		System.out.println("Dime las unidades:");
		int unidades = entrada.nextInt();

		float total = precio * unidades;
		float descuento;

//		if (total > 75) {
//			descuento = 15;
//		} else {
//			descuento = 5;
//		}

		// Operador ternario equivalente al if de arriba.
		descuento = total > 75 ? 15 : 5;

		total = total - total * descuento / 100;
		System.out.println("Tiene un descuento del " + descuento + "%. " + "\nPrecio final: " + total + " €.");

	}
}
