package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PaginationAndSearchingApplication  implements CommandLineRunner{

	@Autowired
	private StudentRepository studRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PaginationAndSearchingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	

		
		
		
	}

}
