package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java", "Lua", "JS\n"); //método para criar uma stream estática
		langs.forEach(print);
		
		String [] maisLangs = {"Phyton", "Lisp", "Pearl", "Go\n"};
		
		Stream.of(maisLangs).forEach(print); //criando stream a partir de um array
		Arrays.stream(maisLangs).forEach(print); //criando stream a partir de um array com Arrays.stream
		Arrays.stream(maisLangs, 1, 2).forEach(print);//trazendo somente o item do indice 1
		
		List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
		outrasLangs.stream().forEach(print); //Criando Strema através de uma lista
		outrasLangs.parallelStream().forEach(print);
				
		
		//Stream.generate(() -> "a").forEach(print); // código infinito
		Stream.iterate(0, n -> n +1).forEach(println); // código infinito
		
	}
}
