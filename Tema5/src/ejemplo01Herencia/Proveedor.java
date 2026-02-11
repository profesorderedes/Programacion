package ejemplo01Herencia;

public final class Proveedor extends Persona {

	private String cp;

	public Proveedor(String nombre, String apellidos, String dni, String cp) {

		super(nombre, apellidos, dni);

		this.cp = cp;

	}

	@Override
	public void mostrar() {

		super.mostrar();
		System.out.println("Código postal: " + cp);

	}

	@Override
	public void darDeAlta() {
		System.out.println("Proveedor añadido a la BD.");
	}

}
