package com.bluelitelabs.bodylab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "membershipType")
public class MembershipType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer membershipTypeId;

	@Column(name = "name", nullable = false, length = 70)
	private String name;

	@Column(name = "description", nullable = true, length = 150)
	private String description;

	@ManyToOne
	@JoinColumn(name = "fitnessCenterId", nullable = false, foreignKey = @ForeignKey(name = "fk_membershipType_fitnesscenter"))
	private FitnessCenter fitnessCenter;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
