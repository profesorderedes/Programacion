package ejemplo02Vehiculo;

public final class Coche extends Vehiculo {

	private int potencia;

	public Coche(String matricula, String marca, String modelo, int potencia) {

		super(matricula, marca, modelo);
		this.potencia = potencia;
	}

	@Override
	public void mostrar() {

		super.mostrar();
		System.out.println("Potencia:" + potencia);

	}
	
	@Override
	public void matricular() {
		System.out.println("Coche matriculado.");
		
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
