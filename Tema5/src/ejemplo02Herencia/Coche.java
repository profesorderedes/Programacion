package ejemplo02Herencia;

public final class Coche extends Vehiculo {

	private double potencia;

	public Coche(String matricula, String marca, String modelo, double potencia) {

		super(matricula, marca, modelo);
		this.potencia = potencia;

	}

	@Override
	public void mostrar() {

		super.mostrar();
		System.out.println("Potencia: " + potencia);

	}

}
