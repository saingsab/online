package com.seschool.online;

import com.seschool.online.models.Author;
import com.seschool.online.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineApplication {

	public static void main(String[] args) {

		SpringApplication.run(OnlineApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository repository
	) {
		return args -> {
			var author = Author
		};
	}
	 */

}
