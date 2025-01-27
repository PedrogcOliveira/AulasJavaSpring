package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		//Adição de valores
		System.out.println(x + y);
		
		//Subtração de valores
		System.out.println(x - y);
		
		//Multiplicação de valores
		System.out.println(x * y);
		
		//Divisão de valores
		System.out.println(x / y);
		
		//Operador de módulo
		System.out.println(x % y);
		
		
		int a = 3;
		int b = 8;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		System.out.println(a % b);
		
		
		int q = 3 * 4 - 10;
		int w = (int) Math.pow(q,3);
		
		System.out.println(w);
		
		
	}
}
