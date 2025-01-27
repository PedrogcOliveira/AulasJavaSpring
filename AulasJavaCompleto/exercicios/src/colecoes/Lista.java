package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		//Obter elemento da lista através do índice
		System.out.println(lista.get(3).nome);
		
		lista.remove(0);//remove o elemento pelo índice
		lista.remove(new Usuario("Manu"));//remove o elemento pelo conteúdo.
		
		System.out.println("tem ? " + lista.contains(new Usuario("Lia")));
		
		lista.contains(new Usuario("Lia"));//Verifica se a lista possui o elemento especificado.
		

		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}
}
