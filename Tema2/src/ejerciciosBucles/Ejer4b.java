package ejerciciosBucles;

import java.util.Scanner;

/*
Escribe una aplicación que pregunte al usuario un número entre 1 
y 5. Si el número no está entre 1 y 5 se le informará. 
Si responde "3", se le felicitará por haber acertado. 
Si no, se le seguirán pidiendo más números.
*/
public class Ejer4b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean preguntar = true;
		
		// Si está entre 1 y 5 miramos si vale 3 y le felicitamos. 
		// Si no es 3, repetimos la pregunta.
		while(preguntar == true) {
			
			// Preguntamos un número.
			System.out.println("Escribe un número entre 1 y 5:");
			int num = entrada.nextInt();
			
			if(num == 3) {
				System.out.println("Felicidades, has acertado.");
				preguntar = false;
			}else if(num >= 1 && num <=5) {
				System.out.println("Vuelve a probar.");
			}else {
				System.out.println("¡Tienes que escribir un "
						+ "número entre 1 y 5!");
			}
			
		}
		
	}

}
