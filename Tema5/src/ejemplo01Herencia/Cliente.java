package ejemplo01Herencia;

public class Cliente extends Persona {

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

}
