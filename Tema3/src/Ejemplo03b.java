import java.util.Scanner;

/*
 * Rellenar un array con valores leídos desde 
 * la consola.
 */
public class Ejemplo03b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float temperaturas[] = new float[7];
		
		for(int i=0; i < temperaturas.length; i++) {
			
			System.out.print("Temperatura del día " + i + ": ");
			temperaturas[i] = entrada.nextFloat();
			
		}
		
		System.out.println("\nTemperaturas registradas durante la"
				+ " semana:\n");
		for(int i = 0; i<temperaturas.length; i++) {
			
			System.out.println(temperaturas[i] + "ºC");
			
		}
		
		
	}
	
}
