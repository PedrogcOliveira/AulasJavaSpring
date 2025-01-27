package fundamentos;

public class TiposPrimitivos {

	public static void main (String [] args) {
			
		
		//Tipos abaixo começam com o número 0
		byte anosDeEmpresa = 32;
		short numeroDeVoos= 542;
		int id = 56789;
		//Para demonstrar valores muito altos, poderá ser usado o '_' ou 'L' para delimitar
		long pontosAcumulados = 1_234_456_223L;
		
		
		//Tipos abaixo tem o valor padrão como 0.0
		//Para demonstrar valores muito altos, poderá ser usado o ou 'F' para deixar explícito a variável float
		float salario = 11_445.56F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		//boolean começa como false padrão
		boolean estaDeFerias = false;
		char status = 'A';
		//char começa como padrão primeiro item tabela unicode
		
		System.out.println(anosDeEmpresa + 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + "Ganha -> " + salario);
		System.out.println("Férias :" + estaDeFerias);
		System.out.println("Status " + status);
		}
}
