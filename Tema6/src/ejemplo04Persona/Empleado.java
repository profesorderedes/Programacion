package ejemplo04Persona;

public class Empleado extends Persona {
	
	private String numSegSocial;
	
	public Empleado(String dni, String nombre, 
			String apellidos, String numSegSocial) {
		
		super(dni, nombre, apellidos);
		this.numSegSocial = numSegSocial;
		
	}

}
