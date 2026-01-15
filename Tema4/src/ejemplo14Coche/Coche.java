package ejemplo14Coche;

public class Coche {

	private String marca;
	private String modelo;
	private String matricula;
	
	// La variable descuento es estática, lo que significa que su valor
	// va a ser el mismo siempre para cualquier objeto Coche.
	private static int descuento;

	public Coche(String marca, String modelo, String matricula) {

		this.marca = marca;
		this.modelo = modelo;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public static int getDescuento() {
		return descuento;
	}

	public static void setDescuento(int descuento) {
		// Escribimos Coche.descuento en vez de this.descuento para
		// no dar la idea de que el descuento puede ser diferente
		// para coches diferentes (this hace referencia a un objeto Coche concreto).
		Coche.descuento = descuento;
	}

}








