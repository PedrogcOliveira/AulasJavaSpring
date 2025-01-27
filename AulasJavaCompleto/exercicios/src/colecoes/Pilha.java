package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		//O comportamento da pilha segue o LIFO último a entrar será o primeiro a sair
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());

		
		System.out.println(livros.poll());
		System.out.println(livros.pop());//Retornará uma exception caso nãoi tenha nada na pilha para remover
		
		//livros.size();
		//livros.clear();
		//livros.contains(livros);
		//livros.isEmpty();
		
		for(String livro:livros) {
			System.out.println(livro);
		}
		}
}
