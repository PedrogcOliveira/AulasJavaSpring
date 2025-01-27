package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(10,10);

		
		
		Heroi heroi = new Heroi(10 ,11);
		
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);
		
		System.out.println("Monstro tem: " + monstro.vida);
		System.out.println("Heroi tem: " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		


	}
	
}
