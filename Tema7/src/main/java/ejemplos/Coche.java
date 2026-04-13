package ejemplos;

public class Coche {

	private int potencia;
	private int puertas;
	private String marca;
	private String color;
	private String matricula;

	public Coche(int potencia, int puertas, String marca, String color, String matricula) {
		this.potencia = potencia;
		this.puertas = puertas;
		this.marca = marca;
		this.color = color;
		this.matricula = matricula;
	}

	@Override
	public String toString() {

		return marca + " - " + color + " - " + matricula + " - " + potencia + " - " + puertas;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
