package colecoes;

import java.util.Objects;

public class Usuario {
	
	String nome;

	Usuario(String nome){
		this.nome = nome;
	}
	
	
	public String toString() {
		return "Meu nome é: " + this.nome + ".";
	}
	
	//Para gerar este Hashcode e Equals, clicar botão direito e source, 'Generate HashCode() e Equals()'
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
//	public int hashCode() {
//		return 0;
//	}
//
	
	//Outra maneira de fazer o equals
//	public boolean equals(Object obj) {
//		Usuario outroUsuario = (Usuario) obj;
//		return this.nome.equals(outroUsuario.nome);
//	}
	
}
