package ejemplosCadenas;

public class Ejemplo06 {

	public static void main(String[] args) {

		String palabra1 = "perro";
		String palabra2 = "hamster";

		System.out.println("La primera palabra, alfabéticamente, es:");
		if (palabra1.compareTo(palabra2) < 0) {
			System.out.println(palabra1);
			
		} else if (palabra1.compareTo(palabra2) > 0) {
			System.out.println(palabra2);
			
		} else {
			System.out.println("(Son la misma palabra)");
		}

	}

}



