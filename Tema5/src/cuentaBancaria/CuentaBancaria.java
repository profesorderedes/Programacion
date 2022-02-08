package cuentaBancaria;

public class CuentaBancaria {

	// Atributos
	private float saldo;
	
	// Constructores
	CuentaBancaria(float saldo) {
		this.saldo = saldo;
	}
	
	// Métodos
	void depositar(float cantidad) {
		saldo = saldo + cantidad;
	}
	
	boolean retirar(float cantidad) {
		
		if(cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		}
		
		return false;
		
	}
	
	float obtenerSaldo() {
		return saldo;
	}
}










