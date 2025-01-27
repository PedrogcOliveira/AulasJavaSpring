package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Comando para verificar em qual local o seu computador está, isso impactando em preenchimento de valores como Double
		//System.out.println(Locale.getDefault());
		
		//Estamos utilizando o replace para tratar qualquer espaçador que for incluído incorretamente pelo usuário trocando ',' por '.'
		System.out.println("Digite seu último salário: ");
		String ultimoSalario = scanner.next().replace(",", ".");
		
		System.out.println("Digite seu penúltimo salário: ");
		String penultimosalario = scanner.next().replace(",", ".");;
		
		System.out.println("Digite seu antepenúltimo salário: ");
		String antepenultimoSalario = scanner.next().replace(",", ".");;
		
		
		double parametro1 = Double.parseDouble(ultimoSalario);
		double parametro2 = Double.parseDouble(penultimosalario);
		double parametro3 = Double.parseDouble(antepenultimoSalario);
	
		double mediaSalarial = (parametro1 + parametro2 + parametro3) / 3;
		
		System.out.println("A média salarial desta pessoa é: " + mediaSalarial);
		
		scanner.close();
	}
}
