import java.util.Iterator;
import java.util.Scanner;

public class Ejemplo02 {

	static float precios[] = new float[5];

	public static void main(String[] args) {
		
		leerPrecios();
		
		ordenarPrecios();
		
		mostrarPrecios();
		
	}
	
	static void leerPrecios() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe 5 precios:");
		
		for (int i = 0; i < precios.length; i++) {
			
			System.out.print("Precio " + (i+1) + ": ");
			precios[i] = entrada.nextFloat();
			
		}
		
	}
	
	static void ordenarPrecios() {
		
		
		
	}
	
	static void mostrarPrecios() {
		
	}
	
}
