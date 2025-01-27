package lambdas;

import java.util.function.Function;

public class Funcao {

	
	public static void main(String[] args) {
		
		
		Function<Integer, String> parOuImpar = numero -> numero %2 == 0 ? "Par" : "Ímpar";
		
		System.out.println(parOuImpar.apply(33));
		
		Function<String, String> oResultadoE = valor -> "O resultado ´e: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String , String> duvida = valor -> valor + "???";
		
		
		//String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(32); 
		
		//apply serve para imprimir o resultado e andThen para concatenar uma função na outra
		// lembrando que o último parametro da function deve ser o parametro de entrada da função que vai concatenar
		
		
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal1);
		
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(32);
		
		
		System.out.println(resultadoFinal2);
	}
}
