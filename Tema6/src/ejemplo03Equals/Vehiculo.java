package ejemplo03Equals;

public class Vehiculo {

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

	// Dos vehículos serán "iguales" si tienen la misma marca,
	// modelo y matrícula.
	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (obj instanceof Vehiculo) {

			Vehiculo vehiculo = (Vehiculo) obj;

			if (vehiculo.marca.equals(marca) && vehiculo.matricula.equals(matricula)
					&& vehiculo.modelo.equals(modelo)) {
				return true;
			}

		}

		return false;

	}

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
