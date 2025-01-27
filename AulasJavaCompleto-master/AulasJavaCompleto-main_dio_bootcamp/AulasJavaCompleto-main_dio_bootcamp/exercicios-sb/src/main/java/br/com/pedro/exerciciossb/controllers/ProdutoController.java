package br.com.pedro.exerciciossb.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedro.exerciciossb.model.entities.Produto;
import br.com.pedro.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository; // para instaciar sem a necessitar de criar o construtor, a classe deve ser restController
	
	
	//Maneira de instanciar direto o produto como parametro
	//@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto( Produto produto) { //@Valid também não está mais disponível 
		produtoRepository.save(produto); // para utilizar. Porém valida o objeto se é válido ou não
		return produto; 
	}
	
	
	@GetMapping
	public Iterable<Produto> obterProdutos() { //Traz todos os produtos da tabela
		return produtoRepository.findAll();
	}
	
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) { //Traz todos os produtos da tabela
		//return produtoRepository.findByNomeContainigIgnoreCase(parteNome);
		return produtoRepository.serachByNameLike(parteNome);
	}
	
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) { //Traz um produto pelo id informado na URL
		return produtoRepository.findById(id);
	}
	
	
	
	@GetMapping(path = "/pagina/{numeroPagina}/{qtd}")
	public Iterable<Produto> obterProdutosPorPagina( //Consutla paginadamente os elementos da tabela
			@PathVariable int numeroPagina,
			@PathVariable int qtd) {
		if(qtd >= 5) qtd = 5;
		Pageable page = PageRequest.of(numeroPagina, qtd);
		return produtoRepository.findAll(page);
	}
	
	
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {// deleta pelo ID
		produtoRepository.deleteById(id);
	}
	


	
	
	
//	@PutMapping
//	public Produto alterarProduto(Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
}
