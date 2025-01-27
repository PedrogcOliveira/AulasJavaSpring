package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


		int quantidaDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		
		while(nota != -1) {
			System.out.println("Informe a nota: ");
			nota = scanner.nextDouble();
			
			if(nota <= 10 && nota >=0) {
			total += nota;
			quantidaDeNotas ++;			
			} else if(nota != -1){
				System.out.println("Nota inválida.");
			}
			
		}

		double media = total / quantidaDeNotas;
		System.out.println("Média é igual a: " + media);
		scanner.close();
		
	}
}
