package oo.composicao.umpraum;

public class Motor {

	//Para tornar a classe de carro e motor bidirecional N para N
	final Carro carro;
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	//Foi montado este construtor para tornar bidirecional
	Motor(Carro carro){
		this.carro = carro;
	}
	//
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
