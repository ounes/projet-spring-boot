package dev.projetspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.projetspringboot.document.Formation;
import dev.projetspringboot.repository.Repository;

@SpringBootApplication
public class ProjetSpringBootApplication implements CommandLineRunner {

	@Autowired
	private Repository repository;
	
	public static void main(String[] args) {
		
		SpringApplication.run(ProjetSpringBootApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		// save formations
		repository.save(new Formation("Big data", 12));
		repository.save(new Formation("Buisness Intelligence", 12));
		repository.save(new Formation("Java", 12));
		
		// fetch all formations
		System.out.println("Formations found with findAll():");
		System.out.println("-------------------------------");
		for (Formation formation : repository.findAll()) {
			System.out.println(formation);
		}
		System.out.println();
		
	}
}
