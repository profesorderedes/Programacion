// Crea un programa que escriba los 50 primeros números pares. 
package ejerciciosBucles;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int cont = 1;
		int contador = 0;
		
		while (cont <= 50)  {
			System.out.println(cont + ")"+ "Numero: " + contador);
			cont = cont +1;
			contador = contador + 2 ;
		}
				
	}
	
}