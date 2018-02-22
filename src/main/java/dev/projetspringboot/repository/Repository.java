package dev.projetspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.projetspringboot.document.Formation;

public interface Repository extends MongoRepository<Formation, Integer> {

	public Formation findByFormationName(String formationName);
    //public List<Formation> findByMaxNumberOfTrainees(Integer maxNumberOfTrainees);
	
	//POST
	
	//GET
    
}

