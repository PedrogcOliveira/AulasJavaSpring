package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
	    
	    var p2 = new Produto();
	    p2.nome = "Caneta Preta";
	    p2.preco = 12.00;
	    Produto.desconto = 0.29;
	    
	    System.out.println(p1.nome);
	    System.out.println("Valor do desconto: " + Produto.desconto);
	    System.out.println("Preco com Desconto: " + p1.precoComDesconto());
	    System.out.println(p2.nome);
	    System.out.println("Valor do desconto: " + Produto.desconto);
	    System.out.println("Preco com Desconto: " + p2.precoComDesconto());
	
	    //Maneira executando a lógica direto na classe
	    //double precoFinal1 = p1.preco * (1 - p1.desconto);
	    double precoFinal1 = p1.precoComDesconto();
	    
	    //Maneira executando a lógica direto na classe
	    //double precoFinal2 = p2.preco * (1 - p2.desconto);
	    double precoFinal2 = p2.precoComDesconto(0.1);
	    double mediaCarrinho = (precoFinal1 + precoFinal2)  / 2;
	    
	    System.out.printf("Média do Carrinho = R$%.2f", mediaCarrinho);
	}
}
