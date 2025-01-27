package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		//Uso de Wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//Convertendo um tipo primitivo setando o Wrapper na impressão
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		//Maneira não muito usual
		System.out.println(("" + num2).length());
	}
}
