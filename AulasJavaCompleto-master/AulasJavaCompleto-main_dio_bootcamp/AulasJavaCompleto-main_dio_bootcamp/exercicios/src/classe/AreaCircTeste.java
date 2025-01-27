package classe;

public class AreaCircTeste {

	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 12;
		
		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 2;
		//Esta é a maneira de acessar um valor estático da classe e alterá-lo para a instância		
		//AreaCirc.PI = 3.1415;
		
		
		System.out.println(a1.area());
		
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}
}
