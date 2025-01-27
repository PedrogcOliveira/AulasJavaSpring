package oo.heranca.desafio;

public class Carro {

	final protected int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	

	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	public void frear() {
		if(velocidadeAtual <= 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= getDelta();
		}
	}
		
		
	public void acelerar() {
		
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA ) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += delta;
		}
	}
		
	
	public int getDelta() {
		return delta;
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	public String toString() {
		return "A velocidade atual é: " + velocidadeAtual + "KM/H";
	}
	
}
