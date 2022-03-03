package ejemplo04Persona;

public class Cliente extends Persona{
	
	String visa;
	
	public Cliente(String dni, String nombre, 
			String apellidos, String visa) {
		
		super(dni, nombre, apellidos);
		this.visa = visa;
		
	}
	
	public void mostrar() {
		
		System.out.println("Datos del cliente:");
		System.out.println("DNI: " + getDni());
		System.out.println("Apellidos: " + getApellidos());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Visa: " + visa);
		
	}
	
}
