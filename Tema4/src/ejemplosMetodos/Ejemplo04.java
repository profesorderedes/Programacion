package ejemplosMetodos;

public class Ejemplo04 {

	public static void main(String[] args) {

		System.out.println(doblar(10));

		int resultado = doblar(11);
		System.out.println("El resultado de doblar 11 es " + resultado);

		System.out.println("El triple de 5 es " + triplicar(5));

		double precio = 100;
		System.out.println("El triple del " + precio + " es " + triplicar(precio));

		System.out.printf("El área de un círculo de radio 5 es %.2f", areaCirculo(5));

	}

	static int doblar(int a) {

		int doble = a * 2;
		return doble;

	}

	static double triplicar(double a) {

		return a * 3;

	}

	static double areaCirculo(double radio) {

		double area = Math.PI * Math.pow(radio, 2);

		return area;

	}

}
