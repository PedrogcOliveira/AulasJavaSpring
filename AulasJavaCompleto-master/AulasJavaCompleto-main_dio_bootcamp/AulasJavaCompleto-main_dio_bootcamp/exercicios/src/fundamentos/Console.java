package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.println("Digite sua Idade: ");
		int idade = scanner.nextInt();
		
		
		System.out.printf("%s %s tem %d anos",nome, sobrenome, idade);
		
		scanner.close();
	}
}
