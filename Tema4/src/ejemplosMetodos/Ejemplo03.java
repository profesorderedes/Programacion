package ejemplosMetodos;

public class Ejemplo03 {

	public static void main(String[] args) {

		// Llamamos al método sumar() pasándole dos argumentos: 2 y 7. Estos valores se
		// copiarán en los parámetros a y b del método.
		sumar(2, 7);

		multiplicar(2, 7, 8);

		saludar("María", 30);

	}

	static void sumar(int a, int b) {

		System.out.println(a + " + " + b + " = " + (a + b));

	}

	static void multiplicar(int a, int b, int c) {

		System.out.println(a + " * " + b + " * " + c + " = " + a * b * c);

	}

	static void saludar(String nombre, int edad) {

		System.out.println("Hola, " + nombre + ", no parece que tengas " + edad + " años.");

	}

}
