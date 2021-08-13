package com.bluelitelabs.bodylab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "membershipType")
public class MembershipType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer membershipTypeId;
	
	@Column(name = "name", nullable = false, length = 70)
	private String name;
	
	 public MembershipType() {
		// TODO Auto-generated constructor stub
	}

	public Integer getMembershipTypeId() {
		return membershipTypeId;
	}

	public void setMembershipTypeId(Integer membershipTypeId) {
		this.membershipTypeId = membershipTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
