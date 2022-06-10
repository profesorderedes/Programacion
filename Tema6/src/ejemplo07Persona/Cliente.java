package ejemplo07Persona;

public class Cliente extends Persona {

	String visa;

	public Cliente(String dni, String nombre, String apellidos, String visa) {

		super(dni, nombre, apellidos);
		this.visa = visa;

	}

	@Override
	public void mostrar() {

		System.out.println("\nDatos del cliente:");
		super.mostrar();
		System.out.println("Visa: " + visa);

	}

	public void mostrarVisa() {

		System.out.println("La VISA del cliente es " + visa);

	}

	// per1.equals(per2)

	@Override
	public boolean equals(Object obj) {

		// ¿Está obj en la misma posición de memoria
		// que esta variable?
		if (this == obj) {
			return true;
		}
		// ¿Es obj null?
		else if (obj == null) {
			return false;
		}
		// ¿Es obj una instancia de Cliente?
		else if (obj instanceof Cliente) {

			// ¿Tiene obj el mismo DNI que esta variable?
			if (((Cliente) obj).getDni().equals(this.getDni())) {
				return true;
			}
		}

		return false;

	}

	public String getDni() {
		return super.getDni();
	}

}
