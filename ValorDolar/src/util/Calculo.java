package util;

public class Calculo {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double price) {
		return (1.0 + IOF) * amount * price;
	}
}
