package ejercicios1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer10 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float compra[] = new float[100];
		
		for(int i = 0; i < compra.length; i++) {
			
			System.out.print("Precio " + (i+1) + ": ");
			compra[i] = entrada.nextFloat();
		
			if(compra[i] == 0) {
				break;
			}
			
		}
		
		System.out.println("\nProductos:");
		for (int i = 0; i < compra.length; i++) {
			
			if(compra[i] != 0) {
				System.out.println("Producto " + (i+1) + ": " 
						+ compra[i] + " €");
			}else {
				break;
			}
			
		}
		
		System.out.println("\nGracias por comprar aquí.");
		
	}
	
}
