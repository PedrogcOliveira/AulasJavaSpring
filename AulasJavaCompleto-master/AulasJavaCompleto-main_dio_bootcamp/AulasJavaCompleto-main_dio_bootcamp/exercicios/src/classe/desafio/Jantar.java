package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		
		
		Comida c1 = new Comida("Carne", 0.321);
		
		Comida c2 = new Comida("Arroz", 1.002);
		
		Pessoa p1 = new Pessoa("Malcom", 77.0);
		
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		p1.comer(c2);
		
		System.out.println(p1.apresentar());
		
//		p1.comer(c1.peso);
//		p1.balanca();
//		
//		p1.comer(c2.peso);
//		p1.balanca();
		
	}
}
