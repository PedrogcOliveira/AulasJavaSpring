package arrays;

import java.util.Arrays; 

public class Exercicio {

	public static void main(String[] args) {
		
		// para definir uma matriz necessita declarar a variável com [] [] 
		// double[] [] notasAlunoA = new double[3] [3]; Seria uma matriz de 3x3
		double[] notasAlunoA = new double[3];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]); // ver primeiro índice do Array
		System.out.println(notasAlunoA[notasAlunoA.length -1]); //Pegaria a última nota dentro do Array
		
		//não manter os parametros de calculo do array como fixo, usar o .length
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
			
		System.out.println(totalAlunoB / notasAlunoB.length);
			
		}
	}
}
