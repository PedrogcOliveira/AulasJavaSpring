package oo.encapsulamento;

public class PessoaTeste {

	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", "Oliveira", 12);
		p1.setIdade(123);
		
		System.out.println(p1.toString());
		System.out.println(p1.getNomeCompleto());
	}
}
