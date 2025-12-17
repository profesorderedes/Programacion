package ejemplos;

import java.util.Arrays;

public class Ejemplo06 {

	public static void main(String[] args) {

		int[] nums = { 5, 0, -3, 10 };

		System.out.println("Valor original: " + Arrays.toString(nums));

		// La variable nums se pasará por referencia, ya que es de tipo objeto.
		// Los cambios que hagamos dentro del método transformar() modificarán
		// el valor de nums.
		transformar(nums);

		System.out.println("Valor tras llamar al método: " + Arrays.toString(nums));

	}

	public static void transformar(int[] a) {

		a[1] = 100;

	}

}
