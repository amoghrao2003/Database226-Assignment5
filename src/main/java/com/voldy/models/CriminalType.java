package com.voldy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "criminaltype")
public class CriminalType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long crimetype_id;

	@NotNull
	@Size(min = 2, max = 80)
	private String type_name;

	@NotNull
	@Size(min = 2, max = 80)
	private String crime_id;

	public CriminalType() {
	}

	public CriminalType(long crimetype_id) {
		this.crimetype_id = crimetype_id;
	}

	public CriminalType(String type_name, String crime_id) {
		this.type_name = type_name;
		this.crime_id = crime_id;

	}

	public long getCrimetype_id() {
		return crimetype_id;
	}

	public void setCrimetype_id(long crimetype_id) {
		this.crimetype_id = crimetype_id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getCrime_id() {
		return crime_id;
	}

	public void setCrime_id(String crime_id) {
		this.crime_id = crime_id;
	}
	
	

}
