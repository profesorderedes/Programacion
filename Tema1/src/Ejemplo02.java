
public class Ejemplo02 {

	public static void main(String[] args) {

		int sueldo; // Declaración de la variable sueldo. La máquina virtual reserva un
					// espacio en la memoria RAM para guardar un número entero, y le
					// asocia el nombre "sueldo".

		sueldo = 2000; // Asignación de un valor a la variable sueldo. Se guarda el número
						// 2000 en la posición de memoria reservada antes.
						// Esto se llama inicialización de la variable (darle un valor inicial).

		// Las dos instrucciones anteriores se pueden juntar en una sola:
		int salario = 2000;

		System.out.println("Salario = " + salario);

		// Una variable puede ir cambiando de valor (por eso se llama "variable"):
		salario = 1500;

		System.out.println("Salario = " + salario);
	}

}
