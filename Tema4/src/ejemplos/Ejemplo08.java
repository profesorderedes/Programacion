package ejemplos;

// Algunas actividades-ejemplo extra.

public class Ejemplo08 {

	public static void main(String[] args) {

		char letra = inicial("Carlos");
		System.out.println("La inicial es " + letra + ".");

		double radio = 10;
		double volumen = volumenEsfera(radio);
		System.out.println("El volumen de una esfera de radio " + radio + " es " + volumen + ".");

		System.out.println("Precio de venta: " + precioVenta(100, 20, 4) + " €");

		System.out.println("El área de un triángulo de base 10 y altura 20 es " + areaTriangulo(10, 20));

	}

	static char inicial(String palabra) {

		char letraInicial = palabra.charAt(0);

		return letraInicial;

	}

	static double volumenEsfera(double r) {

		return 4.0 / 3 * Math.PI * Math.pow(r, 3);

	}

	static double precioVenta(double precio, double descuento, int iva) {

		// Sumamos el IVA.
		double precioVenta = precio + precio * iva / 100;

		// Aplicamos el descuento.
		precioVenta = precioVenta - precioVenta * descuento / 100;

		return precioVenta;

	}

	static double areaTriangulo(double base, double altura) {

		return base * altura / 2;

	}

}
