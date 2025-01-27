package lambdas;

@FunctionalInterface
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
//	default String legal() {//Aceita mais um método na interface desde que não seja necessário implementá-lo nas classes filhas ex: static(estático) ou default(padrão)
//		return "legal";
//	}
//	
//	static String muitoLegal() {
//		return "muito legal";
//	}
}
