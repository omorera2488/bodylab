package com.bluelitelabs.bodylab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idClient;
	
	@Column(name = "name", nullable = false, length = 70)
	private String name;
	
	@Column(name = "lastName", nullable = false, length = 70)
	private String lastName;
	
	@Column(name = "dni", nullable = false, length = 8)
	private String dni;
	
	@Column(name = "address", nullable = true, length = 150)
	private String address;
	
	@Column(name = "phone", nullable = false, length = 9)
	private String phone;
	
	@Column(name = "email", nullable = false, length = 55)
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
