package br.com.tech4me.projetofilmes.telas;

import java.util.Scanner;

import org.springframework.data.repository.Repository;

public interface Tela<T, K> {
    void executar(Scanner entrada, Repository<T, K> repositorio);
}

