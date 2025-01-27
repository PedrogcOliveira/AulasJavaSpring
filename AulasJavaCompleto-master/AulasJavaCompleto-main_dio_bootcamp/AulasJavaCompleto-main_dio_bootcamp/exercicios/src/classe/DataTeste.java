package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(14,04,2001);
		
		//d1.dia = 14;
		//d1.mes = 04;
		//d1.ano = 2024;

		Data d2 = new Data();
		//d2.dia = 24;
		//d2.mes = 12;
		//d2.ano = 2024;
		
		
		String dataFormatada2 = d2.obterDataFormatada();
		
		//System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.println(d1.obterDataFormatada(14, 04, 2024));
		//System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);
		System.out.println(dataFormatada2);
		
		d1.imprimirResultado();
		d2.imprimirResultado();
	}
}
