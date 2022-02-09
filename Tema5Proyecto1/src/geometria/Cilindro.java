package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private final double PI = 3.141592;

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	public double area() {
		return 2 * PI * (radio * altura + Math.pow(radio, 2));
	}

	public double volumen() {
		return PI * Math.pow(radio, 2) * altura;
	}

	public String toString() {

		String resultado;

		resultado = "altura = " + altura + "\nradio = " 
				+ radio;

		return resultado;

	}

}







