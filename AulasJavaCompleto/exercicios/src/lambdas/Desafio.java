package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
		Produto p = new Produto("Ipad",3893.89, 0.13);
		
		
		Function<Produto, Double> calculoDesconto = calcDesc -> (calcDesc.preco * (1 - calcDesc.desconto));
		
		Function<Double, Double> impostoMunicipal = (calcDesc) ->  {
				return calcDesc >= 2500 ? calcDesc * (1 + 0.085)  : calcDesc + 0;
					};
					
		Function<Double, Double> frete = (calcDesc) -> {
			return calcDesc >= 3000 ? (calcDesc + 100) : (calcDesc + 50); 
		};
		
		System.out.printf("O valor final da compra é: R$ %.2f", calculoDesconto.andThen(impostoMunicipal).andThen(frete).apply(p));
		
		
//		//Resposta
//		Function<Produto, Double> precofinal = produto -> produto.preco * (1 - produto.desconto);
//		UnaryOperator<Double> impostoMunicipal2 = preco -> preco >= 2500 ? preco * 1.085 : preco;
//		UnaryOperator<Double> frete2 = preco -> preco >= 3000 ? preco + 100 : preco + 50;
//		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
//		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
//		
//		String preco= precofinal
//				.andThen(impostoMunicipal2)
//				.andThen(frete2)
//				.andThen(arredondar)
//				.andThen(formatar)
//				.apply(p);
//		
//		System.out.println("O preço final é " + precofinal);
		
	}
}
