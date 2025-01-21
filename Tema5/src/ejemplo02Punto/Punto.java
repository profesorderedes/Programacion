package ejemplo02Punto;

public class Punto {

	// Atributos.
	int x; // Coordenada x
	int y; // Coordenada y
	String color; // Color del punto

	// Métodos.
	void mostrar() {

		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("Color = " + color);

	}

	// Desplaza este punto dx caracteres a la derecha y
	// dy caracteres hacia abajo.
	void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	// Nos indica si el punto es de color rojo.
	boolean esRojo() {
		if (color.equals("rojo")) {
			return true;
		}

		return false;
	}

}
