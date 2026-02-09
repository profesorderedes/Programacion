package ejemplo01Herencia;

public class Proveedor extends Persona {

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

}
