package ejemplo01Persona;

// Al hacer la clase Empleado de tipo final evitamos
// que ninguna otra clase pueda heredar de ella.
public final class Empleado extends Persona {

	private int numSegSocial;

	public Empleado(String apellidos, String nombre, String dni, int numSegSocial) {

		super(apellidos, nombre, dni);
		this.numSegSocial = numSegSocial;

	}

	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Número de la seguridad social: " + numSegSocial);
	}

	@Override
	public void leerDatos() {
		// Aquí pondríamos código para leer por la terminal
		// los atributos de esta clase.

	}

	public int getNumSegSocial() {
		return numSegSocial;
	}

	public void setNumSegSocial(int numSegSocial) {
		this.numSegSocial = numSegSocial;
	}

}
