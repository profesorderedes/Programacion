package gestionGastos;

import java.time.LocalDate;

public class Pruebas {

	public static void main(String[] args) {

		// Nuevo Libro
		Libro libro = new Libro();

		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-20"), "Bolígrafo Pilot tinta azul punta fina", -5));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-23"), "Desayuno", -2.5));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-20"), "Desayuno", -3.05));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-15"), "Comida", -15));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-11-01"), "Desayuno", -2.5));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-09-01"), "Salario", 1400));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-09-20"), "Cena", -25));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-20"), "Salario", 1500));
		libro.nuevoAsiento(new Asiento(LocalDate.parse("2025-12-20"), "Entrada cine", -10));

		// Método mostrarAsientosDia()
		libro.mostrarAsientosDia(LocalDate.parse("2025-12-20"));

	}

}
