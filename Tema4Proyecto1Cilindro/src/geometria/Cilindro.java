package geometria;

public class Cilindro {

	private static int altura;
	private int radio;

	private final double PI = 3.141592;

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	public double getArea() {
		return 2 * PI * radio * (altura + radio);
	}

	public double getVolumen() {
		return (PI * radio * radio * altura);
	}

	public String toString() {
		return "Altura: " + altura + "\nRadio: " + radio;
	}

	public int getAltura() {
		return altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
