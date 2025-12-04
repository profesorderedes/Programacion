package ejemplosCadenas;

public class Ejemplo06ValueOf {

	public static void main(String[] args) {

		double pulgadasTv = 15.6;
		//String pulgadas = "" + pulgadasTv;
		String pulgadas = String.valueOf(pulgadasTv);
		
		System.out.println("El tamaño del monitor es de " + pulgadas + " pulgadas");

	}

}
