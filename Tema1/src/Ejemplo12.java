
public class Ejemplo12 {

	public static void main(String[] args) {

		// Operadores lógicos (o booleanos).

		boolean a = true, b = true, c = false, d = false;

		// Operación AND (si).
		System.out.println("¿a y b? " + (a && b));
		System.out.println("¿a y c? " + (a && c));
		System.out.println("¿c y d? " + (c && d));

		// Operación OR (o).
		System.out.println("¿a o b? " + (a || b));
		System.out.println("¿a o c? " + (a || c));
		System.out.println("¿c o d? " + (c || d));

		// Operación NOT (no).
		System.out.println("¿no a? " + !a);
		System.out.println("¿no c? " + !c);
		
		

	}

}
