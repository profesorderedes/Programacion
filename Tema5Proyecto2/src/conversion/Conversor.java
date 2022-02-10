package conversion;

public class Conversor {

	private static final double KM_A_MILLAS = 0.621;
	private static final double MB_A_ATM = 0.000986;
	private static final double CAL_A_JULIOS = 4.187;
	
	public static double millas(double km) {
		return km * KM_A_MILLAS;	
	}
	
	public static double km(double millas) {
		return millas / KM_A_MILLAS;
	}
	
	
}
