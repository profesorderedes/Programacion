package ejercicios;

public class Ejer11b {

	public static void main(String[] args) {

// Crea un método que tome como parámetro un entero representando un año, y devuelva true o

// false indicando si es bisiesto o no.

		System.out.println(bisiesto(2025));

	}

	static String bisiesto(int anyo) {

		int resto = anyo % 4;
		int resto2 = anyo % 100;
		int resto3 = anyo % 400;

		if (resto == 0 && resto2 != 0 || resto3 == 0) {

			return "true";

		} else {

			return "false";

		}

	}

}