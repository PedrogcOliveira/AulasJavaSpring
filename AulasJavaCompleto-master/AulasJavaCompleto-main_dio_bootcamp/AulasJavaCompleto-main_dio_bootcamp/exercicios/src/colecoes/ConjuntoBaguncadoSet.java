package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncadoSet {
	
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		
		//Adiciona elementos ao conjunto
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		//não aceita elementos repetidos
		System.out.println("tamanho" + conjunto.size());
		
		
		//Remove elementos do conjunto
		//retorna um true se conseguir remover, caso não retorna um false
		conjunto.remove('x');
		System.out.println(conjunto.remove('x'));
		
		
		//Faz uma verificação no Set para ver se existe o elemento informado
		System.out.println(conjunto.contains('x'));
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		
		//Realizar a união dos conjuntos, altera o conteúdo dos conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		
		//Realiza a intersecção dos conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		
		//Para limpar os elementos de dentro do conjunto
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}
