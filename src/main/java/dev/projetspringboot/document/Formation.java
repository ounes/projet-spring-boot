package dev.projetspringboot.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "formations")
public class Formation {

	@Override
	public String toString() {
		return "Formation [id=" + id + ", formation name=" + formationName + ", maximum number of trainees="
				+ maxNumberOfTrainees + "]";
	}

	@Id
	private String id;

	String formationName;

	Integer maxNumberOfTrainees;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFormation_name() {
		return formationName;
	}

	public void setFormation_name(String formation_name) {
		this.formationName = formation_name;
	}

	public Integer getMaximum_number_of_trainees() {
		return maxNumberOfTrainees;
	}

	public void setMaximum_number_of_trainees(Integer maxNumberOfTrainees) {
		this.maxNumberOfTrainees = maxNumberOfTrainees;
	}

	public Formation () {
		
	}
	
	public Formation (String id, String formationName, Integer maxNumberOfTrainees) {
		this.id=id;
		this.formationName=formationName;
		this.maxNumberOfTrainees=maxNumberOfTrainees;
	}
	
	public Formation (String formationName, Integer maxNumberOfTrainees) {
		this.formationName=formationName;
		this.maxNumberOfTrainees=maxNumberOfTrainees;
	}
	
}
