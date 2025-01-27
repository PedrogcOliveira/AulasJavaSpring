package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite quantas notas deseja informar: ");
		int indice = scanner.nextInt();
		double[] nota = new double[indice];
		
		
		//double soma = 0;
		for(int i = 0; i < nota.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ":");
			nota[i] = scanner.nextDouble();
			//soma += scanner.nextDouble(); Maneira como foi usado para solucionar antes da resposta do desafio
			//soma += nota[i]; Maneira como foi usado para solucionar antes da resposta do desafio
			//System.out.println(soma);
		}
		
		//System.out.println(soma / nota.length);
		
		double total = 0;
		for (double notas:nota) {
			total += notas;
		}
		
		double media = total / nota.length;
		System.out.println("A média é: " + media);

		scanner.close();
	}
	
}
