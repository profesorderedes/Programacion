package ejemplo13Coche;

public class Coche {

	private String matricula;
	private String modelo;

	// Suponemos que según la época del año el concesionario
	// ofrece un descuento, que es el mismo para todos los coches.
	private static int descuento;

	// Suponemos que el IVA es el mismo para todos los coches.
	// No es constante porque el gobierno puede cambiarlo.
	static double iva;

	Coche(String matricula, String modelo) {

		this.matricula = matricula;
		this.modelo = modelo;

	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		Coche.descuento = descuento;
	}

}
