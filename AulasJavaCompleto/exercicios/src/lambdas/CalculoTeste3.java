package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		

		BinaryOperator<Double> calculoSoma = (x, y) -> {return x + y;	};
		System.out.println(calculoSoma.apply(2.0, 3.0));
		
		calculoSoma = (a,b) -> a + b;
		System.out.println(calculoSoma.apply(2.0, 3.0));
		
		
		BinaryOperator<Integer> calc = (x, y) -> {return x + y;	};
		System.out.println(calc.apply(2, 3));
		
		calculoSoma = (a,b) -> a + b;
		System.out.println(calc.apply(2, 3));
	}
	
}
