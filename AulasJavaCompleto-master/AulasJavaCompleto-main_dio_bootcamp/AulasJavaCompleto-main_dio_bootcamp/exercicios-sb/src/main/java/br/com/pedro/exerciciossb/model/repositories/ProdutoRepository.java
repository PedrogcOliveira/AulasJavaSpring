package br.com.pedro.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.pedro.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{//JpaRepository, PagingAndSortingRepository, CrudRepository
	
	public Iterable<Produto> findByNomeContainigIgnoreCase(String parteNome);
	
	
	//Outras convenções
	
	//findByNomeContaining
	//findByNomeIsContaining
	//findByNomeContains
	
	//findByNomeStartsWith
	//findByNomeEndsWith
	
	//findByNomeNotContaining
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> serachByNameLike(@Param("nome") String nome);
}
