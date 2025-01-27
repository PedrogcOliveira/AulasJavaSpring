package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println(resultado);
		
//		int calculo1 = (6 * (3 + 2));
//		int calculo2 = (int) (Math.pow(calculo1, 2) / (3 * 2));
//		int calculo3 = ((1 - 5) * (2 - 7) / 2);
//		int calculo4 = (int) Math.pow(calculo3, 2);
//		int calculo5 =  (calculo2 - calculo4);
//		int inferior = (int) Math.pow(10, 3);
//		int calculo6 = (int) (Math.pow(calculo5, 3) / inferior);
//		System.out.println(calculo6);
	}
}
