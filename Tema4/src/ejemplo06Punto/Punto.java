package ejemplo06Punto;

public class Punto {

	// Atributos de la clase Punto.

	int x;
	int y;
	String color;

	// Métodos de la clase Punto.

	Punto(int x, int y, String color) {

		this.x = x;
		this.y = y;
		this.color = color;

	}

	Punto(int x, int y) {

		this.x = x;
		this.y = y;

	}

	void mostrar() {

		System.out.println("\nx=" + x + ", y=" + y + ", color=" + color);

	}

	void moverX(int dx) {
		x = x + dx;
	}

	void moverY(int dy) {
		y = y + dy;
	}

	void moverXY(int dx, int dy) {
		moverX(dx);
		moverY(dy);
	}

}
