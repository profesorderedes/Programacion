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

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
