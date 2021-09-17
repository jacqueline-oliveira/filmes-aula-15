package br.com.tech4me.projetofilmes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.tech4me.projetofilmes.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
    List<Filme> findByOrderByTituloAsc();

    List<Filme> findByTituloContainsIgnoreCaseOrderByTituloAsc(String busca);

    @Query("select f from Filme f left join fetch f.atuacoes")
    List<Filme> obterFilmesComAtuacaoEDiretores();
}
