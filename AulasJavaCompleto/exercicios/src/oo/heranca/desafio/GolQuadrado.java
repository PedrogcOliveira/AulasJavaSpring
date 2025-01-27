package oo.heranca.desafio;

public class GolQuadrado extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public GolQuadrado() {
		super(200);
	}
	
	public GolQuadrado(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(35); //substituir o método de subscrição do acelerar
	}
	
	@Override
	public void acelerar() {
		velocidadeAtual += 15;
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;	
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;	
	}
	
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr){
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
		
	}
}
