
/*
Programa que pregunta el precio de un producto.
Si es menor de 50 euros, no tendrá descuento, si está entre 50 
y 100 euros (ambos inclusive), tendrá un descuento del 5%.
Si está entre 100 y 200 euros (incluyendo 200), tendrá un 10% de 
descuento. En otro caso, tendrá un 15%.
 */

import java.util.Scanner;

public class Ejemplo08 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Pedimos el precio.
		System.out.print("Precio: ");
		float precio = entrada.nextFloat();
		
		// En función del precio, indicaremos el descuento.
		if(precio < 50) {
			System.out.println("Descuento = 0");
		}else if(precio <= 100) {
			System.out.println("Descuento = 5%");
		}else if(precio <= 200) {
			System.out.println("Descuento = 10%");
		}else {
			System.out.println("Descuento = 15%");
		}
		
		System.out.println("Fin");
		
	}

}
















