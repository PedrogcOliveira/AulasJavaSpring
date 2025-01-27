package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		//byte
		Byte b = 1;
		Short s = 1000;
		//Integer t = Integer.parseInt(entrada.next());
		Long l = 100000L;
		System.out.println(l);
		
		//Wrapper de Float
		Float f = 123.00F;
		System.out.println(f);
		
		//Wrapper de Double
		Double d = 1234.7890;
		System.out.println(d);
		
		System.out.println(b.byteValue());
		
		//Converte valor de short para String
		System.out.println(s.toString());
		
		//Converter valor em String para int
		Integer i = Integer.parseInt("1000");
		System.out.println(i);
		
		//Pegando uma String e transformando em um inteiro para realizar o cálculo
		//System.out.println(t * 3);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		//System.out.println(bo.toString().toUpperCase());
		System.out.println(("" + bo).toUpperCase());
		
		//Converte um Char para String
		Character c = '#';
		System.out.println(c + "...");
		
		entrada.close();
	}
}
