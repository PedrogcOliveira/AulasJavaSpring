package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");//este método adiciona se não existir e substitui se já existir
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());//para pegar todas as chaves do conjunto
		System.out.println(usuarios.values());//para pegar todas aos valores do conjunto
		System.out.println(usuarios.entrySet());//para pegar as chaves e os valores do conjunto
		
		System.out.println(usuarios.containsKey(20));//para saber se contém a chave que foi informada
		System.out.println(usuarios.containsValue("Roberto"));//para saber se contém o valor que foi informado
		
		
		System.out.println(usuarios.get(1));//para retornar através das chaves
		System.out.println(usuarios.remove(3));//para remover através das chaves
		System.out.println(usuarios.remove(2, "Ricardo"));
		
		//percorrer o conjunto através das chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//percorrer o conjunto através dos valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//percorrer o conjunto através dos valores e das chaves, pois somente no for não será possível
		for(Entry<Integer, String> linha : usuarios.entrySet() ) {
			System.out.print(linha.getKey() + " ");
			System.out.println(linha.getValue());
		}
		
	}
	
}
