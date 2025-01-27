package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia1";
		
		//Notação para deixar o conteúdo em maiúsculo
		s = s.toUpperCase();
		//Notação para realizar a troca de um conteúdo da String
		s = s.replace("1", "!");
		//Notação para concatenar uma String
		s = s.concat(".");
		System.out.println(s);
		
		String x = "Olá,".replace(",", "Pedro").toUpperCase().concat("!!!");
		System.out.println(x);
	}
}
