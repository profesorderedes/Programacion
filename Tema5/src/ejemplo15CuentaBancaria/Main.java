package ejemplo15CuentaBancaria;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria c1 = new CuentaBancaria(3000);

		c1.depositar(500);
		System.out.println(c1.obtenerSaldo());
		
		boolean retirado = c1.retirar(4000);
		
		if(retirado) {
			System.out.println("Se ha retirado la cantidad.");
		}else {
			System.out.println("No se ha podido retirar la cantidad. Fondos insuficientes.");
		}
		
		System.out.println(c1.obtenerSaldo());

	}

}
