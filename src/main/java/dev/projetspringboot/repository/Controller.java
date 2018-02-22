package dev.projetspringboot.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.projetspringboot.document.Formation;

@RestController
@RequestMapping("/formations")
public class Controller {
	
	@Autowired private Repository formations;
	
	@RequestMapping(method = RequestMethod.POST)
	public void postFormation(@RequestBody Formation formation) {
		this.formations.save(formation); 
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Formation> getFormation() {
		return this.formations.findAll(); 
	}
	
}
