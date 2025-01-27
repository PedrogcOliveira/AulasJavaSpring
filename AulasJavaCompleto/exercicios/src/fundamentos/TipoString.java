package fundamentos;

public class TipoString {
	
	public static void main (String []args) {
		//charAt mostra o caractere que está ocupando o índice específico
		System.out.println("Olá pessoal".charAt(0));
		
		//startsWith faz uma validação na String para verificar se a mesma começa com o valor da condição
		String s = "Boa tarde!";
		System.out.println(s.startsWith("Boa"));
		
		//endsWith valida se a String finaliza com o valor da condição
		System.out.println("dia");
		
		//length retorna o valor da String
		System.out.println(s.length());
		
		//equals verifica se a sentença é igual ao valor que foi informado no parametro
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		//Outro método de verificação seria o '.contains'. Que valida se a String possui a condição indicada
		System.out.println(s.contains("bo"));
		
		//indexOf procura e imprime qual o índice de uma palavra ou caracter dentro de uma String
		System.out.println(s.indexOf(0));
		
		//substring imprime a partir do indice daquela String, e pode ser setado até qual índice ele irá retornar
		System.out.println(s.substring(3, 7));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 23;
		var salario = 1232.2;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");
		
		//Uma maneira mais limpa de fazer a imnpressão dos dados seria com printf
		//o trecho %s substitui valores com String, %d substitui com valores inteiros e %f para valores com ponto flutuante
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario + "\n\n");
		
		//Outra maneira ainda seria usando uma variavel com o '.format' que seria semelhante ao printf
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
