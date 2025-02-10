package ejemplo15CuentaBancaria;

public class CuentaBancaria {

	private int saldo;
	
	public CuentaBancaria(int saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(int cantidad) {
		
		saldo = saldo + cantidad;
		
	}
	
	public boolean retirar(int cantidad) {
		
		if (cantidad > saldo) {
			return false;
		} else {
			return true;
		}
		
		
	}
	
	public int obtenerSaldo() {
		return saldo;
	}
	
}
