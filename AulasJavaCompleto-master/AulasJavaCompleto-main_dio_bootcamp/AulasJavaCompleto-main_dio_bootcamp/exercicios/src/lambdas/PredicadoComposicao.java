package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <=999;
		
		System.out.println(isPar.and(isTresDigitos).test(122)); //And serve para fazer a composição da interface funcional.
																// Negate serve para negar o resultado da interface funcional.
																//or vale com o "ou" de uma condição
	}
}
