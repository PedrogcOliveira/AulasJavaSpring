package oo.composicao.desafio;

public class ClienteTeste {

	
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 2.50, 4);//esta maneira já é com a criação do produto dentro do Item
		compra1.adicionarItem(new Produto("Notebook", 2250.56), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 9.67, 10);//esta maneira já é com a criação do produto dentro do Item
		compra2.adicionarItem(new Produto("Impressora", 998.90), 1);//este é intaciação do produto na declaração dos valores
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.adicionarCompra(compra1);//Maneira 1
		cliente.compras.add(compra2);//Maneira 2
		
		System.out.println(cliente.obterValorTotal());
		
		
		
		//4 princípios de OO
		//Encapsulamento
		//Herança
		//Polimorfismo
		//Abstração
	}
}
