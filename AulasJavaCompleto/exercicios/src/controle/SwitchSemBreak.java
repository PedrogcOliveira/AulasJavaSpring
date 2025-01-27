package controle;

public class SwitchSemBreak{

	public static void main(String[] args) {
		
		
		String faixa = "Preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heidan Godan");
		case "verde":
			System.out.println("Sei o Heidan Yodan");
		case "laranja":
			System.out.println("Sei o Heidan Sandan");
		case "vermelha":
			System.out.println("Sei o Heidan Nidan");
		case "amarela":
			System.out.println("Sei o Heidan Shodan");
//			default:
//				System.out.println("Não sei de nada!");
		}
	}
}
