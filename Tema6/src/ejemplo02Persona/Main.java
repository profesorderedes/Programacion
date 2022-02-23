package ejemplo02Persona;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setDni("11128912Y");
		cliente1.setNombre("Pepe");
		cliente1.setApellidos("Rodríguez Pérez");
		cliente1.setVisa("2819-1231-2121-4525");
		
		Empleado empleado1 = new Empleado();
		
		empleado1.setDni("21988921Y");
		empleado1.setNombre("María");
		empleado1.setApellidos("Alarcón Sánchez");
		empleado1.setNumSegSocial("2123234tas");
		
		Persona persona1 = new Persona();
		persona1.setDni("12221234G");
		persona1.setNombre("Luisa");
		persona1.setApellidos("Sáez Luque");
		
//		persona1.mostrar();
		
		// Cliente y empleado heredan el método mostrar().
		cliente1.mostrar();
		
		
		
		
		
		
		
		
		
		
		
	}

}
