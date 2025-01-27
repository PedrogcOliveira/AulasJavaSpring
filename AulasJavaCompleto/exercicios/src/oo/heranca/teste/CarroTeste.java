package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.GolQuadrado;
import oo.heranca.desafio.Monza;

public class CarroTeste {

	public static void main(String[] args) {
		
	
	Carro carro1 = new Monza();
	GolQuadrado carro2 = new GolQuadrado();
	
	carro1.acelerar();
	carro2.acelerar();
	
	
	System.out.println(carro1.toString());
	System.out.println(carro2.toString());
	
	carro1.acelerar();
	carro2.acelerar();
	carro2.ligarTurbo();
	
	System.out.println(carro2.velocidadeDoAr());
	
	System.out.println(carro1.toString());
	System.out.println(carro2.toString());
	
	carro1.frear();
	carro1.frear();
	carro1.frear();
	carro1.frear();
	carro1.frear();
	carro1.frear();
	carro1.frear();
	carro1.frear();
	carro1.frear();
	carro1.frear();
	
	System.out.println(carro1.toString());
	System.out.println(carro2.toString());
	}
}
