package ejemplo01Persona;

// Al hacer la clase Cliente de tipo final evitamos
// que ninguna otra clase pueda heredar de ella.
public final class Cliente extends Persona {

	private String visa;

	public Cliente(String apellidos, String nombre, String dni, String visa) {
		super(apellidos, nombre, dni);
		this.visa = visa;
	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("VISA: " + visa);
	}

	@Override
	public void leerDatos() {
		// Aquí pondríamos código para leer por la terminal
		// los atributos de esta clase.
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

}
