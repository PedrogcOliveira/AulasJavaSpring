package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextDouble();
		
		
		System.out.println("Digite a operação que deseja realizar: ");
		String operacao = scanner.next();
		//System.out.println(operacao);
		
		Double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;

		
		System.out.printf("%.2f %s %.2f = %.2f", num1 ,operacao, num2, resultado );
		
		
		scanner.close();
	}
}
