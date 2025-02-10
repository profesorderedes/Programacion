package ejemplo15CuentaBancaria;

public class Main {

	public static void main(String[] args) {
		
		CuentaBancaria c1 = new CuentaBancaria(3000);
		
		c1.depositar(500);
		System.out.println(c1.retirar(3000));
		
		System.out.println(c1.obtenerSaldo());
		
		
	}

}
