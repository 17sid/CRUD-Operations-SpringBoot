package com.siddhesh.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}
	public void setFirstName(String firstName2) {
		// TODO Auto-generated method stub
		this.firstName=firstName2;
	}
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}
	public void setLastName(String lastName2) {
		// TODO Auto-generated method stub
		this.lastName=lastName2;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		this.email=email2;
	}

}
