package br.com.igorn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.igorn")
public class PrimeiroProjetoUsandoSpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoUsandoSpringbootApplication.class, args);
	}
}
