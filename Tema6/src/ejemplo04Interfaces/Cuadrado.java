package ejemplo04Interfaces;

public class Cuadrado implements Figura2D, Mostrable {

	private int x, y; // Coordenadas del vértice superior derecho.
	private int lado;

	public Cuadrado(int x, int y, int lado) {
		this.x = x;
		this.y = y;
		this.lado = lado;
	}

	@Override
	public void mostrar() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("lado = " + lado);
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimetro() {
		return 4 * lado;
	}

}
