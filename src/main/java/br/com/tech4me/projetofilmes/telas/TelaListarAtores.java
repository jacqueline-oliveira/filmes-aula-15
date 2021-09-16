package br.com.tech4me.projetofilmes.telas;

import java.util.List;
import java.util.Scanner;
import org.springframework.data.repository.Repository;
import br.com.tech4me.projetofilmes.model.Ator;
import br.com.tech4me.projetofilmes.repository.AtorRepository;

public class TelaListarAtores implements Tela<Ator, Integer>{

    @Override
    public void executar(Scanner entrada, Repository<Ator, Integer> repositorio) {
        AtorRepository repo = (AtorRepository)repositorio;
        List<Ator> atores = repo.findAll();

        if(atores.isEmpty()) {
            System.out.println("\nNão há nenhum ator cadastrado.");
            return;
        }

        System.out.println("\n***************************");
        System.out.println("Lista de atores cadastrados");
        System.out.println("***************************");
        atores.forEach(System.out::println);
    }
                                  
}
