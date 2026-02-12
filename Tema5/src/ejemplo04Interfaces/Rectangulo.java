package ejemplo04Interfaces;

public class Rectangulo implements Figura2D, Mostrable {

	private int x;
	private int y;
	private int base;
	private int altura;

	public Rectangulo(int x, int y, int base, int altura) {
		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public double perimetro() {
		return 2 * base + 2 * altura;
	}

	@Override
	public void mostrar() {
		System.out.println("Rectángulo de base " + base + " y altura + " + altura + ".");
	}

}
