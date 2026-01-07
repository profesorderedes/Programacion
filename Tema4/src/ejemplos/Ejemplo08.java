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

	/**
	 * Recibe un String y devuelve el primer carácter de ese String.
	 * 
	 * @param palabra Cadena de caracteres de la que se va a obtener la primera
	 *                letra.
	 * @return La inicial de la palabra recibida.
	 */
	static char inicial(String palabra) {

		char letraInicial = palabra.charAt(0);

		return letraInicial;

	}

	/**
	 * Recibe el radio de una esfera y devuelve su volumen.
	 * 
	 * @param r Radio de la esfera
	 * @return Volumen de la esferea de radio r
	 */
	static double volumenEsfera(double r) {

		return 4.0 / 3 * Math.PI * Math.pow(r, 3);

	}

	/**
	 * Calcula el precio de venta de un producto.
	 * 
	 * @param precio    Precio original del producto.
	 * @param descuento Descuento a aplicar al producto.
	 * @param iva       IVA aplicable.
	 * @return Precio final del producto.
	 */
	static double precioVenta(double precio, double descuento, int iva) {

		// Sumamos el IVA.
		double precioVenta = precio + precio * iva / 100;

		// Aplicamos el descuento.
		precioVenta = precioVenta - precioVenta * descuento / 100;

		return precioVenta;

	}

	/**
	 * Calcula el área de un triángulo.
	 * 
	 * @param base   Base del triángulo
	 * @param altura Altura del triángulo.
	 * @return Área del triángulo
	 */
	static double areaTriangulo(double base, double altura) {

		return base * altura / 2;

	}

}
