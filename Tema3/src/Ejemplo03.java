import java.util.Scanner;

/*
 * Rellenar un array con valores leídos desde 
 * la consola.
 */
public class Ejemplo03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float temp;
		float temperaturas[] = new float[7];
		
		for(int i=0; i < temperaturas.length; i++) {
			
			System.out.print("Temperatura del día " + i + ": ");
			temp = entrada.nextFloat();
			
			temperaturas[i] = temp;
			
		}
		
		System.out.println("\nTemperaturas registradas durante la"
				+ " semana:\n");
		for(int i = 0; i<temperaturas.length; i++) {
			
			System.out.println(temperaturas[i] + "ºC");
			
		}
		
		
	}
	
}
