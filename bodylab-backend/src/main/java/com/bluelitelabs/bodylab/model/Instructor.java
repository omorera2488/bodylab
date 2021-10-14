package com.bluelitelabs.bodylab.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor extends Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer instructorId;

	@OneToMany(mappedBy = "instructor", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<WorkoutPlan> listOfWorkoutsCreated;

	public Integer getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Integer instructorId) {
		this.instructorId = instructorId;
	}

	public List<WorkoutPlan> getListOfWorkoutsCreated() {
		return listOfWorkoutsCreated;
	}

	public void setListOfWorkoutsCreated(List<WorkoutPlan> listOfWorkoutsCreated) {
		this.listOfWorkoutsCreated = listOfWorkoutsCreated;
	}

}
