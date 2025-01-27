package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportadoSet {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados =  new HashSet<>();
		SortedSet<String> listaAprovados =  new TreeSet<>();// Garante que os elementos fiquem ordenados ao serem chamados.
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato:listaAprovados) {
			System.out.println(candidato);
		}
		
		
		Set<Integer> nums =  new HashSet<>();
		//SortedSet<String> listaAprovados =  new TreeSet<>();// Garante que os elementos fiquem ordenados ao serem chamados.
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n:nums) {
			System.out.println(n);
		}
	}
}
