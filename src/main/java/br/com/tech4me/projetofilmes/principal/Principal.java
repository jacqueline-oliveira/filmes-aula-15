package br.com.tech4me.projetofilmes.principal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.tech4me.projetofilmes.model.Filme;
import br.com.tech4me.projetofilmes.repository.FilmeRepository;

@Component
public class Principal {
    @Autowired
    private FilmeRepository repositorio;

    public void listagem() {
        List<Filme> filmes = repositorio.findByOrderByTituloAsc();

        if (filmes.isEmpty()) {
            System.out.println("Não tem filmes a exibir");
            return;
        }        

        System.out.println("A relação completa de filmes: \n");
        filmes.forEach(System.out::println);

    }
    
}
