package com.prashant.jpa;

import com.prashant.jpa.models.Author;
import com.prashant.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

    @Bean
    public CommandLineRunner commandLineRunner(AuthorRepository authorRepository){
        return args -> {
            var author = Author.builder()
                    .firstName("Prashant")
                    .lastName("Ranjan")
                    .age(25)
                    .email("ranjan.prashant@gmail.com")
                    .build();
            authorRepository.save(author);
        };
    }

}
