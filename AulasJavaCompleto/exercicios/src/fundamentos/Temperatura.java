package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		double valorFahrenheit = 150.6;	
		final int parametroCalculo = 32;
		final double parametroCalculo1 = 5/9.0;
		double valorCelcius = (valorFahrenheit - parametroCalculo) * parametroCalculo1;
		
		//double calculoValorCelcius = (valorFahrenheit - 32) * 5/9;
		

		System.out.println("A temperatura em Celcius é: " + valorCelcius + " Cº");

	}
}
