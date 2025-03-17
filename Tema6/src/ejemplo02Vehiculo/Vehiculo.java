package ejemplo02Vehiculo;

public abstract class Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;

	public Vehiculo(String matricula, String marca, String modelo) {

		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public void mostrar() {
		System.out.println("\nMatricula: " + matricula + "\nMarca " + marca + " \nModelo " + modelo);
	}

	public abstract void matricular();

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
