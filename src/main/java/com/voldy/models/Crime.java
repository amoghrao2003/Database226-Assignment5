package com.voldy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="crime")
public class Crime {

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long crime_id;
	  

	  
	  @NotNull
	  @Size(min = 2, max = 80)
	  private String time;
	  
	  public Crime() { }

	  public Crime(long crime_id) { 
	    this.crime_id = crime_id;
	  }

	  public Crime(String time) {
	    this.time = time;
	    
	  }

	public long getCrime_id() {
		return crime_id;
	}

	public void setCrime_id(long crime_id) {
		this.crime_id = crime_id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	  
}
