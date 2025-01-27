package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	
	public static void main(String[] args) {
		
		double a = 1; // Conversão Implícita
		System.out.println(a);
		
		//float b = 1.0F; //Conversão Explícita (Cast)
		float b = (float) 1.0; //Conversão Explícita (Cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //Conversão Explícita (Cast)
		System.out.println(d);
		
		double e = 1;
		int f = (int) e; //Conversão Explícita (Cast)
		System.out.println(f);
		
		
	}
}
