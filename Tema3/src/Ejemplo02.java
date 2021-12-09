
/*
 * Array creado poniendo directamente sus valores.
 */
public class Ejemplo02 {

	public static void main(String[] args) {

		float precios[] = { 25, 23.5F, 24.3F, 26, 0 };

		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre" };

		System.out.println("\nLos doce meses del año son:");

		for (int i = 0; i < meses.length; i++) {

			System.out.println(meses[i]);

		}

	}

}
