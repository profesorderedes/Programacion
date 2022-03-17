package ejemplo10Excepciones;

import java.util.Scanner;

public class Division4 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime un número y dividiré 20 "
				+ "entre él");
		System.out.print("Número: ");
		
		String numero = entrada.nextLine();
		
		dividir(numero);
		
		
	}
	
	public static void dividir(String numero) {
		
		// Abrimos un bloque try{} antes de las instrucciones
		// que sabemos que pueden dar error.
		try {
			int num = Integer.parseInt(numero);
		
			System.out.println("\nLa división de 20 entre " 
				+ num + " da " + 20/num);
			return;
		}catch (NumberFormatException ex) {
			System.out.println("¡Debes introducir un número "
					+ "entero!");
		}catch (ArithmeticException ex) {
			System.out.println("¡No se puede dividir entre 0!");
		}catch (Exception ex) {
			System.out.println("Se ha producido un error "
					+ "indeterminado.");
		}
		finally {
			System.out.println("Gracias por dividir.");
		}
				
	}

}
