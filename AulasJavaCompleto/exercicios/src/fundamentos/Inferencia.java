package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		//inferência de tipos = 'var'
		// pelo valor inserido o Java identifica o tipo que deve ser lido
		var b = 4.5;
		System.out.println(b);
		
		//Porém o valor deve ser sempre do mesmo tipo, sem sofrer alterações durante o código
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
	}

}
