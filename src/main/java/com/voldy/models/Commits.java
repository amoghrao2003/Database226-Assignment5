package com.voldy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="commits")
public class Commits {

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long commits_id;
	
	  @NotNull
	  @Size(min = 2, max = 80)
	  private String criminal_id;
	  
	  @NotNull
	  @Size(min = 2, max = 80)
	  private String crime_id;
	  
	  
	  public Commits() { }

	  

	  public Commits(String criminal_id,String crime_id) {
	    this.criminal_id = criminal_id;
	    this.crime_id = crime_id;
	    
	  }

}
