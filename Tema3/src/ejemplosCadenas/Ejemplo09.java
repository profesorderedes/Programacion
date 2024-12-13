package ejemplosCadenas;

public class Ejemplo09 {

	public static void main(String[] args) {

		String datosCliente = "Salas Díaz,Ana,40,asalas@gmail.com";
		
		String[] datosSeparados = datosCliente.split(",");
		
		System.out.println("Datos del cliente");
		System.out.println("==========================");
		System.out.println("Apellidos: " + datosSeparados[0]);
		System.out.println("Nombre: " + datosSeparados[1]);
		System.out.println("Edad: " + datosSeparados[2]);
		System.out.println("Email: " + datosSeparados[3]);

	}

}
