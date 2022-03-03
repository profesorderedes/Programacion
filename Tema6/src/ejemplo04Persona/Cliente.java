package ejemplo04Persona;

public class Cliente extends Persona{
	
	String visa;
	
	public Cliente(String dni, String nombre, 
			String apellidos, String visa) {
		
		super(dni, nombre, apellidos);
		this.visa = visa;
		
	}
	
}
