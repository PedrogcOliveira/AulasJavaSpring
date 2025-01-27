package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	public String obterDataFormatada(int dia, int mes, int ano) {
		return dia + "/" + mes + "/" + ano;
	}
	
	

	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);
	}
	
	//Resposta Desafio Método data
	String obterDataFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	//Não recomendado por não ter como trabalhar com esse retorno VOID
	void imprimirResultado() {
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
	}
	
	
//	public String obterDataFormatada() {
//	return dia + "/" + mes + "/" + ano;
//
//}
}
