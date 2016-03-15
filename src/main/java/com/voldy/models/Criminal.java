package com.voldy.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="criminal")
public class Criminal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long criminal_id;
  

  
  @NotNull
  @Size(min = 2, max = 80)
  private String criminal_name;
  
  @NotNull
  @Size(min = 2, max = 80)
  private String profession;
  
  @NotNull
  @Size(min = 2, max = 80)
  private String age;

  public Criminal() { }

  public Criminal(long criminal_id) { 
    this.criminal_id = criminal_id;
  }

  public Criminal(String criminal_name, String profession,String age) {
    this.criminal_name = criminal_name;
    this.profession = profession;
    this.age = age;
  }

public long getCriminal_id() {
	return criminal_id;
}

public void setCriminal_id(long criminal_id) {
	this.criminal_id = criminal_id;
}

public String getCriminal_name() {
	return criminal_name;
}

public void setCriminal_name(String criminal_name) {
	this.criminal_name = criminal_name;
}

public String getProfession() {
	return profession;
}

public void setProfession(String profession) {
	this.profession = profession;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

  // Getter and setter methods ...
  
}