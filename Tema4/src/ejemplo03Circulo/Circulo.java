package ejemplo03Circulo;

public class Circulo {

	int x;
	int y;
	int radio;
	String color;

	void mostrar() {

		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("radio = " + radio);
		System.out.println("color = " + color);

	}

	double area() {
		return Math.PI * radio * radio;
	}

	double perimetro() {
		return 2 * Math.PI * radio;
	}

}
