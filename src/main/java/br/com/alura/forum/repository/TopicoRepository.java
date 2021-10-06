package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso);//quand for para pesquisar por um atributo especifico tem que usar os nomes da variaveis
	//Como por exemplo nesse caso em que usaremos o atributo nome do Curso que esta dentro do Topico.java
	//Ou seja, ta filtrando pelo atributo de um relacionamento de uma entidade
	//pode ser tanto como apresnetado como "findByCurso_Nome"
	
//	QUANDO NÃO QUISER UTILIZAR A NOMENCLATURA DO JPA, ESSE É UMA OPÇÃO DE QUERY
//	@Query("SELECT t FROM topico t WHERE t.curso.nome == :nomeCurso")
//	List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);

	
}
