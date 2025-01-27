package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	
	//resposta desafio
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Me chamo " + nome + " e tenho " + peso + " KG";
	}
	
	
//	Comida c = new Comida();
//	
//	double pesoComida = c.peso;
//	double pesoAposRefeicao;
//	
//	double comer(double pesoComida) {
//		pesoAposRefeicao = peso + pesoComida;
//		return pesoAposRefeicao; 
//		
//	}
//	
//	void balanca() {
//		 System.out.printf("\nNome: %s\nPeso atual: %.3f\nPeso Após refeição: %.3f", nome, peso, pesoAposRefeicao);
//	}
}
