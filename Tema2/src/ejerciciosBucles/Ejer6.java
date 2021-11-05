package ejerciciosBucles;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numeros pares menores de 200\n");
		
		int contador = 2;
		
		while (contador < 200) {
			
			System.out.println(contador + ")");
			contador = contador + 2;
			
		}
	}

}