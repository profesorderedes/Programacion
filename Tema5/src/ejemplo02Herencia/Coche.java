package ejemplo02Herencia;

public class Coche extends Vehiculo {

	private double potencia;

	public Coche(String matricula, String marca, String modelo, double potencia) {

		super(matricula, marca, modelo);
		this.potencia = potencia;

	}

}
