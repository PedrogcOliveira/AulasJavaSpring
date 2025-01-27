package oo.composicao.umpraum;

public class Carro {

	final Motor motor;
	
	//Foi montado este construtor para tornar bidirecional
	Carro(){
		this.motor = new Motor(this);
	}
	
	public void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	public void frear() {
		if(motor.fatorInjecao > 0.5) {
		motor.fatorInjecao -= 0.4;
		}
	}
	
	public void ligar() {
		motor.ligado = true;
	}
	
	public void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
