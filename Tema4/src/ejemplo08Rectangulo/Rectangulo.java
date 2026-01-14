package ejemplo08Rectangulo;

public class Rectangulo {

	// Vértice superior izquierdo del rectángulo.
	int x, y;
	int base, altura;
	String color;

	Rectangulo(int x, int y, int base, int altura, String color) {

		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;

	}

	Rectangulo(int base, int altura, String color) {

		this(0, 0, base, altura, color);

	}

	Rectangulo(int base, int altura) {

		this(0, 0, base, altura, "negro");

	}

	void mostrar() {

		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("base = " + base);
		System.out.println("altura = " + altura);
		System.out.println("color = " + color);

	}

	void mover(int dx, int dy) {

		x = x + dx;
		y = y + dy;

	}

	boolean contiene(int a, int b) {

		if (a >= x && a <= x + base && b >= y && b <= y + altura) {
			return true;
		}

		return false;

	}

}
