import java.util.Scanner;

public class Ejemplo08 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Vamos a pedir un precio y si no es válido, indicaremos
		// que se esperaba un número.
		
		System.out.println("Escribe el precio del producto:");
		
		// Al llamar a hasNextFloat, el programa esperará a que el usuario
		// escriba algo en la terminal y pulse ENTER.
		if(entrada.hasNextFloat()) {
			
			// Leemos el valor escrito por el usuario, que se quita del 
			// buffer de entrada y se guarda en la variable precio.
			float precio = entrada.nextFloat();
			
			System.out.println(precio  + " euros es un precio correcto.");
			
		}else {
			System.out.println("No es un precio correcto.");
		}
		
	}
}





