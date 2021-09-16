package br.com.tech4me.projetofilmes.telas;

import java.util.List;
import java.util.Scanner;
import org.springframework.data.repository.Repository;

import br.com.tech4me.projetofilmes.model.Ator;
import br.com.tech4me.projetofilmes.repository.AtorRepository;

public class TelaBuscarAtor implements Tela<Ator, Integer> {

    @Override
    public void executar(Scanner entrada, Repository<Ator, Integer> repositorio) {
        System.out.println("\n**************");
        System.out.println("Busca de Ator");
        System.out.println("**************");

        System.out.print("Nome a procurar: ");
        String busca = entrada.nextLine();

        List<Ator> resultado = ((AtorRepository)repositorio).findByNomeContainsIgnoreCaseOrderByNomeAsc(busca);

        if(resultado.isEmpty()) {
            System.out.println("\nNão foram encontrados atores com o parâmetro informado.");
            return;
        }

        System.out.println("\nResultado da busca:");
        System.out.println("-------------------");
        resultado.forEach(System.out::println);
        System.out.printf("\n%d Ator(es) encontrado(s).\n", resultado.size());
    }
}
