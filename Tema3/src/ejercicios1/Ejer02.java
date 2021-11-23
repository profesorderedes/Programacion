package ejercicios1;
public class Ejer02 {

	public static void main(String[] args) {
		
		int j = 0;
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", 
				"Mayo","Junio", "Julio", "Agosto", "Septiembre", 
				"Octubre", "Noviembre", "Diciembre"};

		System.out.println("Los doce meses del año son:\n");
		
		while (j < meses.length) {
			System.out.println("- "+meses[j]);
			j++;
		}

	}
}