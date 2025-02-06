package ejemplo10Punto;

public class Punto {

	// Atributos.
	private int x; // Coordenada x
	private int y; // Coordenada y
	private String color; // Color del punto

	// Constructor.
	public Punto(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public Punto(int x, int y) {
		this(x, y, "negro");
	}

	// Métodos.
	public void mostrar() {

		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("Color = " + color);

	}

	// Desplaza este punto dx caracteres a la derecha y
	// dy caracteres hacia abajo.
	public void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	// Nos indica si el punto es de color rojo.
	public boolean esRojo() {
		if (color.equals("rojo")) {
			return true;
		}

		return false;
	}

	// Métodos de acceso.

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
