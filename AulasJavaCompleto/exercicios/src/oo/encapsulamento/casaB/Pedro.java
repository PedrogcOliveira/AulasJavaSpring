package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
		//Ana mae = new Ana(); não necessita da instância pois trata-se de uma herança
		void testeAcessos() {
			//System.out.println(mae.segredo);//private
			//System.out.println(mae.facoDentroDeCasa);//package
			System.out.println(formaDeFalar);//protected
			System.out.println(todosSabem);//public
		
		
	}
}

