import java.util.Scanner;

public class Ejemplo01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Pedimos la edad del usuario.
		
		System.out.println("¿Cuántos años tienes?");
		int edad = entrada.nextInt();
		
		// Condicional que comprueba si la edad es válida para
		// entrar en la discoteca.
		
		if(edad < 18) {
			System.out.println("No puedes entrar, pardillo.");
		}
		
		System.out.println("Gracias por venir a nuestra discoteca.");
		
	}
	
}
