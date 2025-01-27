package oo.heranca;

public class Heroi extends Jogador{ //a palavra extends, define que esta classe recebe os comportamentos e atributos por herança

	public Heroi(int x, int y){
		super(x, y); // faz a chamada do constutor padrão da classe pai
	}
	
	public boolean atacar(Jogador oponente) {
		
		boolean ataque1 = super.atacar(oponente);//chamando o método da classe pai pelo "super."
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
		
	}
}
