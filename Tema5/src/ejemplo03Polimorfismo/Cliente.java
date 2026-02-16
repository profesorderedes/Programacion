package ejemplo03Polimorfismo;

// Hacemos la clase Cliente de tipo final para que no se 
// puedan crear clases hijas.
public final class Cliente extends Persona {

	private String visa;

	public Cliente(String nombre, String apellidos, String dni, String visa) {

		// Lo primero que tiene que hacer un constructor es llamar a un
		// constructor de la clase padre. Esto se hace con super().
		super(nombre, apellidos, dni);

		// Inicializamos aparte los atributos de esta clase.
		this.visa = visa;

	}

	// Sobreescribimos el método mostrar().
	@Override
	public void mostrar() {

		super.mostrar();
		System.out.println("Tarjeta VISA: " + visa);

	}

	@Override
	public void darDeAlta() {
		System.out.println("Cliente añadido a la BD.");
	}

	public void cobrar() {
		System.out.println("Se ha cobrado al cliente.");
	}

	@Override
	public String toString() {

		return "Nombre: " + getNombre() + "\n" + "Apellidos: " + getApellidos();

	}

}
