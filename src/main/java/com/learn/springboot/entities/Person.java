package com.learn.springboot.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	@Id
	private long aadhar;
	
	private String name;
	private int age;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Passport passport;

}
