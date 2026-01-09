package ejemplo02Punto;

public class Punto {

	// Atributos de la clase Punto.

	int x;
	int y;
	String color;

	// Métodos de la clase Punto.

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
		
	}

}
