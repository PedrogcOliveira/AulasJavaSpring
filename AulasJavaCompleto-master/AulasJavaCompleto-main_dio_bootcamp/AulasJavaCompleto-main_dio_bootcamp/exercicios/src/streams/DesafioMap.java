package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Consumer<String> print = System.out::print;
		
		
		
		Function<Integer, String> paraBinario = n -> Integer.toBinaryString(6);
		
		
		//UnaryOperator<String> inverter = ;
		UnaryOperator<String> inverter = (n) -> 
		{ return n = new StringBuilder().reverse().toString(); };
		
		//Function<String, Interger> paraDecimal = ;

		//String inverterFrase = new StringBuilder().reverse().toString();
		
		
		/*
		 * 1. Numero para String binária 6 -> "110"
		 * 2. Inverter a String "110" -> "011"
		 * 3. Converter de volta para o inteiro => "011" -> 3
		 */
		
		
		nums.stream()
			.map(paraBinario)
			.map(inverter).forEach(print);
			
			//.map(reverter)
			//.forEach(print);

		
	}
}
