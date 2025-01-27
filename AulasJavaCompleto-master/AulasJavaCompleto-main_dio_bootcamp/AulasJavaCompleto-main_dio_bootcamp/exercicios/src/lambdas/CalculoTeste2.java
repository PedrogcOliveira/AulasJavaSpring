package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//Utilizando Lambda
		Calculo calculoSoma = (x, y) -> {return x + y;	};
		Calculo soma = (a,b) -> a + b;
		
		System.out.println(calculoSoma.executar(2, 3));
		System.out.println(soma.executar(2, 3));
		
	}
}
