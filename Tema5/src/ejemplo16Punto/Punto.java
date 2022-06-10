package ejemplo16Punto;

public class Punto {

	// Atributos
	int x;
	int y;
	String color;

	// Constructores

	Punto() {

	}

	// Deja la x y la y con valor 0.
	Punto(String color) {
		this(0, 0, color);
	}

	// Dejará el color con valor "Negro".
	Punto(int x, int y) {
		this(x, y, "Negro");
	}

	Punto(int x, int y, String color) {

		this.x = x;
		this.y = y;
		this.color = color;

	}

	// Métodos
	void mostrar() {

		System.out.println("\nx: " + x);
		System.out.println("y: " + y);
		System.out.println("Color: " + color);

	}

	// El método desplazar está sobrecargado porque
	// hay varias versiones con distintos parámetros
	// (distinta firma).
	void desplazar(int dx) {

		x = x + dx;

	}

	void desplazar(int dx, int dy) {

		x = x + dx;
		y = y + dy;

	}

}
