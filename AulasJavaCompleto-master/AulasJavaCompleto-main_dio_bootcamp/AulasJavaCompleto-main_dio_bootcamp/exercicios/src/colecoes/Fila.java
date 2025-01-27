package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//O comportamento da fila segue o FIFO o primeiro a entrar será o primeiro a sair
		
		//Add e Offer -> adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia
		//Add retorna um FALSE dizendo que não pode ser incluído mais elementos na fila
		//Offer retorna uma excption para ser tratada
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		
		//Para pegar objetos da fila
		//Diferença é o comportamento quando a fila está vazia
		//Peek e Element -> obter o próximo elemento da fila (ser remover)
		System.out.println(fila.peek());//retorna falso quando vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());//lança uma exceção caso esteja vazia
		
		
		
		fila.size();//para saber o tamanho da fila
		fila.clear();//para limpar a fila
		fila.isEmpty();//para saber se a fila está vazia
		fila.contains("");//para saber se o elemento possui o conteúdo que foi buscado
		
		fila.poll();//retorna o primeiro objeto da fila removendo o mesmo
		
		fila.remove();//remove o próximo elemento da fila		
	}
}
