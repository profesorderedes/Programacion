package ejemplo12Rectangulo;

public class Rectangulo {

	private int x, y; // Coordenadas del vértice superior izquierdo
	private int base, altura;
	private String color;

	public Rectangulo(int x, int y, int base, int altura, String color) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;
	}

	public Rectangulo(int x, int y, int base) {
		this(x, y, base, 10, "morado");
	}

	public void mostrar() {

		System.out.println("\nCoordenadas: (" + x + ", " + y + ")");
		System.out.println("Dimensiones: " + base + " x " + altura);
		System.out.println("Color: " + color);

	}

	public double area() {
		return base * altura;
	}

	public double perimetro() {
		return 2 * base + 2 * altura;
	}

	public void desplazar(int dx, int dy) {

		x = x + dx;
		y = y + dy;

	}

	// Recibe las coordenadas (a,b) de un punto y nos dice si ese
	// punto está dentro del rectángulo.
	public boolean contiene(int a, int b) {

		if (a > x && a < x + base && b > y && b < y + altura) {
			return true;
		}

		return false;

	}

}
