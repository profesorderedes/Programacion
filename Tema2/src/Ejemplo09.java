import java.util.Scanner;

public class Ejemplo09 {

	public static void main(String[] args) {

		// Operador ternario: se usa cuando queremos que una
		// variable tome un valor u otro en función de
		// una condición.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el precio de la compra:");
		float precio = entrada.nextFloat();

//		int descuento;
//		if (precio < 100) {
//			descuento = 0;
//		} else {
//			descuento = 15;
//		}
		
		// variable = condición ? valor1 : valor2;
		// La variable tomará el valor 1 si la condición es cierta, y el
		// valor 2 si es falsa.
		
		int descuento = precio < 100 ? 0 : 15;
		

		System.out.println("Se le aplicará un descuento del " + descuento + "%.");

	}
}




