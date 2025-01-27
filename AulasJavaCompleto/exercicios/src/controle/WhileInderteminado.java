package controle;

import java.util.Scanner;

public class WhileInderteminado {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		String captura1 = "";
		
		while (!captura1.equalsIgnoreCase("sair")) {
			System.out.println("Digite uma frase aqui: ");
			captura1 = scanner.next();
		}
			
		System.out.println("Fim");
		scanner.close();
	}
}
