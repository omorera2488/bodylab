package com.bluelitelabs.bodylab.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@MappedSuperclass
public class Person {

	@Size(min = 3, message = "The name must be at least 3 characters long.")
	@Column(name = "name", nullable = false, length = 70)
	private String name;

	@Size(min = 3, message = "The lastname must be at least 3 characters long.")
	@Column(name = "lastName", nullable = false, length = 70)
	private String lastName;

	@Size(min = 3, message = "The dni must be at least 3 characters long.")
	@Column(name = "dni", nullable = false, length = 8)
	private String dni;

	@Size(min = 3, max = 150, message = "The name must be at least 3 characters long. 150 chars Max")
	@Column(name = "address", nullable = true, length = 150)
	private String address;

	@Size(min = 9, message = "The name must be at least 9 characters long.")
	@Column(name = "phone", nullable = false, length = 9)
	private String phone;

	@Email
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
