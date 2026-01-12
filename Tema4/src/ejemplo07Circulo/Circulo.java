package ejemplo07Circulo;

public class Circulo {

	int x;
	int y;
	int radio;
	String color;

	Circulo(int x, int y, int radio, String color) {

		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;

	}

	Circulo(int radio) {

		this.radio = radio;
		color = "negro";

	}

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
