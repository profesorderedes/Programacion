package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();

		cliente1.dni = "11128912Y";
		cliente1.nombre = "Pepe";
		cliente1.apellidos = "Rodríguez Pérez";
		cliente1.visa = "2819-1231-2121-4525";

		Empleado empleado1 = new Empleado();

		empleado1.dni = "21988921Y";
		empleado1.nombre = "María";
		empleado1.apellidos = "Alarcón Sánchez";
		empleado1.numSegSocial = "2123234tas";

	}

}
