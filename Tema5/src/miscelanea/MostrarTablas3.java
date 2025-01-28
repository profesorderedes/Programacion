package miscelanea;

public class MostrarTablas3 {

	public static void main(String[] args) {

		String articulos[][] = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		mostrarPrecios(articulos);

	}

	static void mostrarPrecios(String articulos[][]) {

		System.out.println("Listado de articulos\n===========================");

		for (int i = 0; i < articulos.length; i++) {

			System.out.printf("%-20s %4s€\n", articulos[i][0], articulos[i][1]);

		}

	}

}