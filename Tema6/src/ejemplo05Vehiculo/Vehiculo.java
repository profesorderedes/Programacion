package ejemplo05Vehiculo;

public abstract class Vehiculo {

	private String matricula;
	private String modelo;
	private String marca;

	public Vehiculo(String matricula, String modelo, String marca) {

		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
