import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una palabra:");
		String palabra = entrada.nextLine();
		
		mostrar(palabra);
		
	}

	// Método que tome como parámetro una palabra y la 
	// muestre en pantalla.
	
	static void mostrar(String palabra) {
		
		System.out.println(palabra);
		
	}
	
	
}
