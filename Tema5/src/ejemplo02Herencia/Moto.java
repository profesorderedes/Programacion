package ejemplo02Herencia;

public class Moto extends Vehiculo {

	private double cilindrada;

	public Moto(String matricula, String marca, String modelo, double cilindrada) {

		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;

	}

	@Override
	public void mostrar() {
		
		super.mostrar();
		System.out.println("Cilindrada: " + cilindrada);
		
	}
}
