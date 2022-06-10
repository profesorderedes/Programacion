package ejemplo08;

public class Punto {

	// Atributos
	int x;
	int y;
	String color;

	// Método constructor
	Punto(int x, int y, String color) {

		this.x = x;
		this.y = y;
		this.color = color;

	}

	// Métodos
	void mostrar() {

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("Color: " + color);

	}

	void desplazar(int dx) {

		x = x + dx;

	}

}
