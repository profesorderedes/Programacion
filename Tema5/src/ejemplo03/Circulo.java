package ejemplo03;

public class Circulo {

	int x;
	int y;
	int radio;

	void mostrar() {

		System.out.println("Atributo x: " + x);
		System.out.println("Atributo y: " + y);
		System.out.println("Atributo radio: " + radio);

	}

	double area() {
		double area;
		area = Math.PI * radio * radio;

		return area;
	}

	double perimetro() {

		double perimetro = 2 * Math.PI * radio;

		return perimetro;

	}

}
