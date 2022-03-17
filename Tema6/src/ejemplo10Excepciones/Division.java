package ejemplo10Excepciones;

import java.util.Scanner;

public class Division {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime un número y dividiré 20 "
				+ "entre él");
		System.out.print("Número: ");
		
		String numero = entrada.nextLine();
		
		int num = Integer.parseInt(numero);
		
		System.out.println("\nLa división de 20 entre " 
				+ num + "da " + 20/num);
		
	}

}
