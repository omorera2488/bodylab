package com.bluelitelabs.bodylab.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor extends Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer instructorId;

	private List<FitnessCenter> fitnessCenters;

	public Integer getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Integer instructorId) {
		this.instructorId = instructorId;
	}

}
