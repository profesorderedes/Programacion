
public class Ejemplo07 {

	public static void main(String[] args) {

		boolean a = true; // "Estamos en el 2021"
		boolean b = true; // "Esto es primero de superior"
		boolean c = false; // "Es verano"
		boolean d = false; // "Estamos en la Edad Media"

		System.out.println("a AND b: " + (a && b));
		System.out.println("a AND c: " + (a && c));

		System.out.println("a OR b: " + (a || b));
		System.out.println("a OR c: " + (a || c));
		System.out.println("c OR d: " + (c || d));

		System.out.println("NOT a: " + (!a));
		System.out.println("NOT c: " + (!c));

		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));

	}

}
