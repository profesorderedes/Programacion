package ejemplo02Vehiculo;

public final class Moto extends Vehiculo {

	private int cilindrada;

	public Moto(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Cilindrada: " + cilindrada + " cm3");
	}

	@Override
	public void matricular() {
		System.out.println("Moto matriculada.");
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
