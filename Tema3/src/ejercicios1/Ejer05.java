package ejercicios1;

public class Ejer05 {

	public static void main(String[] args) {

		float notas[] = new float[5];

		notas[0] = 6.75F;
		notas[1] = 9.75F;
		notas[2] = 6;
		notas[3] = 8;
		notas[4] = 5.4F;

		int i = 0;
		while (i < notas.length) {
			System.out.println(notas[i]);
			i++;
		}

	}

}