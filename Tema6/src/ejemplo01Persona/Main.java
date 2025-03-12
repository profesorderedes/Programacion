package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		p1.setApellidos("García");
		p1.setNombre("Antonio");
		p1.setDni("22100200R");
		
		p1.mostrar();
		
		Cliente c1 = new Cliente();
		
		c1.setApellidos("Martínez");
		c1.setNombre("Luis");
		c1.setDni("10299100K");
		c1.setVisa("1092-1274-1291-5312");
		
		c1.mostrar();
		
		Empleado e1 = new Empleado();
		e1.setApellidos("López");
		e1.setNombre("Daniel");
		e1.setDni("10299197G");
		e1.setNumSegSocial(38912961);
		
	}

}
