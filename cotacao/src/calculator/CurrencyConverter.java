package calculator;

public class CurrencyConverter {
	
	public static final double IOF = 6;
	
	public static double Calculator(double dolar, double reais){
		return (dolar * reais) + (dolar *  reais * IOF) / 100;
	}
}
