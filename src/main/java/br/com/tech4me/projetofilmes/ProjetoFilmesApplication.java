package br.com.tech4me.projetofilmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tech4me.projetofilmes.telas.LoopPrincipal;


@SpringBootApplication
public class ProjetoFilmesApplication implements CommandLineRunner{
	@Autowired
	private LoopPrincipal principal;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFilmesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		principal.loop();
		System.exit(0);
		
	}
}
