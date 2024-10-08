
public class Ejemplo04 {

	public static void main(String[] args) {

		// Tipos primitivos para números enteros.

		byte edad = 40; // De -128 a +127

		short anyo = 2025; // De -32768 32767

		int poblacion = 50_000_000; // De -2.147 millones a 2.147 millones

		long piSinComa = 3141592652846281342L; // De -9 trillones a 9 trillones

		// Tipos primitivos para números decimales.

		float pi = 3.1415926F; // De -3.4e38 a 3.4e38

		double e = 2.7182818;

		// Los valores guardados en un float o double pueden perder precisión.
		double num = 0.1 * 3;

		// La operación anterior debería resultar 0.3 pero da 0.30000000000000004
		System.out.println(num);

	}

}
