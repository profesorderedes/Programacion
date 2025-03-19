package ejemplo04Interfaces;

public class Circulo implements Figura2D, Mostrable {

	private int x, y; // Coordenadas del centro
	private int radio;

	public Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	@Override
	public void mostrar() {
		System.out.println("\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("radio = " + radio);
	}

	@Override
	public double area() {
		return Math.PI * radio * radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;

	}

}
