package auxiliar;

import java.util.Scanner;

public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, 
			String nombre, Grupo grupo) {
		
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
		
	}

	public String toString() {

		return "\nNúmero de expediente: " + numExpediente 
				+ "\nApellidos: " + apellidos + "\nNombre: " 
				+ nombre + "\nGrupo: \n" + grupo.toString();

	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Lectura de datos de alumno");
		System.out.println("================================");

		System.out.println("Número de expediente: ");
		numExpediente = entrada.nextInt();
		entrada.nextLine();

		System.out.println("Apellidos: ");
		apellidos = entrada.nextLine();

		System.out.println("Nombre: ");
		nombre = entrada.nextLine();

		// Inicializamos grupo para que no nos dé error
		// al llamar a leeDatos().
		grupo = new Grupo();
		System.out.println("Grupo: ");
		grupo.leeDatos();

	}
}
