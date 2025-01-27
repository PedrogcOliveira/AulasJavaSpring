package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
//	public double somar (double preco, double desconto) {	
//	}
	
	
	//Construtor que solicita argumentos na declaração da instância
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//construtor que não solicita argumentos na declaração padrão da instância
	Produto(){
		
	}
	
	
	public double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	
	public double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
	
	
	
}
