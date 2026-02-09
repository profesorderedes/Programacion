package ejemplo01Herencia;

public class Empleado extends Persona {

	private String numSegSocial;

	public Empleado(String nombre, String apellidos, String dni, String numSegSocial) {

		// Obligatorio: llamar a un constructor de la clase padre (Persona).
		super(nombre, apellidos, dni);

		this.numSegSocial = numSegSocial;

	}

	@Override
	public void mostrar() {

		super.mostrar();
		System.out.println("Número de la seguridad social: " + numSegSocial);

	}
}






