package ejemplos;

public class Ejemplo07 {

	// La variable PI es global, lo que significa que podemos acceder a ella
	// desde cualquier método.
	final static double PI = 3.141593;

	public static void main(String[] args) {

		// radio es una variable local, sólo existe dentro de este método.
		int radio = 10;
		System.out.println(areaCirculo(radio));
		System.out.println("pi = " + PI);

	}

	static double areaCirculo(double radio) {

		// radio y area son una variables locales, sólo existen dentro de este método.
		double area = PI * Math.pow(radio, 2);

		return area;

	}

}
