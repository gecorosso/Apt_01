package it.catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("it.catalogo.controller")
@EnableJpaRepositories(basePackages = "it.catalogo.repository" )
public class MyCatalogueBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCatalogueBootApplication.class, args);
		
	}

}
