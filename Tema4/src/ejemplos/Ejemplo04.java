package ejemplos;

// Métodos que devuelven un valor (no son void).

public class Ejemplo04 {

	public static void main(String[] args) {

		int resultado = doble(15);
		System.out.println("El resultado ha sido " + resultado + ".");

		System.out.println("El resultado ha sido " + doble(15) + ".");

		System.out.println("El triple de " + 5 + " es " + triple(5) + ".");

		System.out.println("La inicial de la palabra ordenador es " + inicial("ordenador") + ".");

		System.out.println("El área de un círculo de radio 5 es " + areaCirculo(5) + ".");

		System.out.println("El volumen de la esfera de radio 10 es " + volumenEsfera(10) + ".");

		System.out.println(
				"Si un artículo cuesta 100 euros, se le hace un descuento del 7% y se le aplica un IVA de 21%,\nhabrá que pagar "
						+ precioVenta(100, 7, 21) + " euros.");

		System.out.println("El área de un triángulo de base 20 y altura 5 es " + areaTriangulo(20, 5) + ".");

	}

	// Método que recibe un número y devuelve el doble del mismo.
	static int doble(int num) {
		System.out.println("Calculando el doble de " + num + "...");
		return num * 2;
	}

	// triple(num)
	static int triple(int num) {

		int triple = num * 3;
		return triple;

	}

	// Método que recibe una palabra como argumento y devuelve la inicial.
	// inicial(palabra)

	static char inicial(String palabra) {
		return palabra.charAt(0);
	}

	// Método que recibe el radio de un círculo como argumento y devuelve el
	// área de ese círculo.
	// areaCirculo(r)

	static double areaCirculo(double r) {
		return Math.PI * r * r;
	}

	// Método que recibe el radio de una esfera como argumento y devuelve el
	// volumen de esa esfera.
	// volumenEsfera(r)
	static double volumenEsfera(double r) {
		return 4 / 3 * Math.PI * r * r * r;
	}

	// Método que recibe un precio, el descuento a aplicar y el iva a aplicar y
	// devuelve el precio final.
	// precioVenta(precio, descuento, iva)

	static double precioVenta(double precio, double descuento, double iva) {
		double rebaja = precio * descuento / 100;
		double precioRebajado = precio - rebaja;
		double ivaAplicable = precioRebajado * iva / 100;

		return precioRebajado + ivaAplicable;
	}

	// Método que devuelve el área de un triángulo tras recibir como parámetros
	// su base y su altura.
	// areaTriangulo(base, altura)
	static double areaTriangulo(double base, double altura) {
		double area = base * altura / 2;
		return area;
	}

}
