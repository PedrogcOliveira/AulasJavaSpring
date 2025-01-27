package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		// parseInt() possibilita para transformar String em inteiro
		// parseDouble(). Possibilita a Conversão de String para double
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
	
		
		double soma = numero1 + numero2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("a média é: " + soma / 2);
	}

}
