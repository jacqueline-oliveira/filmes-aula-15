package br.com.tech4me.projetofilmes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tech4me.projetofilmes.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
    List<Filme> findByOrderByTituloAsc();

    List<Filme> findByTituloContainsIgnoreCaseOrderByTituloAsc(String busca);
}
