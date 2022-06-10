package ejemplo07Persona;

public class Empleado extends Persona {

	private String numSegSocial;

	public Empleado(String dni, String nombre, String apellidos, String numSegSocial) {

		super(dni, nombre, apellidos);
		this.numSegSocial = numSegSocial;

	}

	@Override
	public void mostrar() {

		System.out.println("\nDatos del empleado:");
		super.mostrar();
		System.out.println("Número seg. social: " + numSegSocial);

	}

}
