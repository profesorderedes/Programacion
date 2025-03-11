package ejemplo16GarbageCollector;

import java.util.Scanner;

public class Circulo {

	private int x;
	private int y;
	private int radio;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("En marcha el recolector de basura!!!");
	}

	public Circulo(int x, int y, int radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	public Circulo(int radio) {
		this(0, 0, radio);
	}

	public void mostrar() {

		System.out.println("\nAtributo x: " + x);
		System.out.println("Atributo y: " + y);
		System.out.println("Atributo radio: " + radio);

	}

	public double area() {
		double area;
		area = Math.PI * radio * radio;

		return area;
	}

	public double perimetro() {

		double perimetro = 2 * Math.PI * radio;

		return perimetro;

	}

	public void leerPropiedades() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca las propiedades del círculo:");
		System.out.print("Coordenada x del centro: ");
		x = entrada.nextInt();

		System.out.print("Coordenada y del centro: ");
		y = entrada.nextInt();

		System.out.print("Radio del círculo: ");
		radio = entrada.nextInt();

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

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
