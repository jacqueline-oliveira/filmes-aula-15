package br.com.tech4me.projetofilmes.repository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import br.com.tech4me.projetofilmes.model.Ator;

public interface AtorRepository extends JpaRepository<Ator, Integer> {
    
  List<Ator> findByNomeContainsIgnoreCaseOrderByNomeAsc(String busca);

}

