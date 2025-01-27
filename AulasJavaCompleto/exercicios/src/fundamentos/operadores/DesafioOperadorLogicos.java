package fundamentos.operadores;



public class DesafioOperadorLogicos {

	public static void main(String[] args) {
		
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		
		boolean tv50Polegadas = trabalhoTerca && trabalhoQuinta;
		boolean tv32Polegadas = trabalhoTerca ^ trabalhoQuinta;
		boolean tomarSorvete = tv50Polegadas || tv32Polegadas;
		boolean ficarEmCasa = !trabalhoTerca && !trabalhoQuinta;
		boolean ficarSaudavel = !tomarSorvete;
		
		System.out.println("Compramos uma TV de 50 polegadas ?" + tv50Polegadas);
		System.out.println("Compramos uma TV de 32 polegadas ? " + tv32Polegadas);
		System.out.println("Tomamos sorvete ? " + tomarSorvete);
		System.out.println("ficamos em casa ? " + ficarEmCasa);
		System.out.println("ficamos saudáveis sem tomar o sorvete ?" + ficarSaudavel);
		
	}
}
