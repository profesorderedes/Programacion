
/*
 * Crear un array y dar valor a las celdas individualmente.
 */
public class Ejemplo01 {

	public static void main(String[] args) {

		float precios[] = new float[5];
		
		// También se puede:
		// float[] precios = new float[5];

		precios[0] = 25;
		precios[1] = 23.5F;
		precios[2] = 24.3F;
		precios[3] = 26;

		System.out.println("En la posición 0 se encuentra " + precios[0]);
		System.out.println("En la posición 1 se encuentra " + precios[1]);

		System.out.println("La suma de los dos primeros " 
				+ "precios es " + (precios[0] + precios[1]));

		System.out.println("\nSi no introducimos un valor en "
				+ "una posición, valdrá " + precios[4]);
		
	}

}
