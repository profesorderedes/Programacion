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

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (obj instanceof Cliente) {

			return ((Cliente) obj).getDni().equals(getDni());

		}

		return false;

	}

	public String getDni() {
		return super.getDni();
	}

}
