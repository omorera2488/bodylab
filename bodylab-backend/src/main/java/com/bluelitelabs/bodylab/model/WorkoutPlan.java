package com.bluelitelabs.bodylab.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workoutPlan")
public class WorkoutPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "memberId", nullable = false, foreignKey = @ForeignKey(name = "fk_workoutPlan_member"))
	private Member member;

	@ManyToOne
	@JoinColumn(name = "instructorId", nullable = false, foreignKey = @ForeignKey(name = "fk_workoutPlan_instructor"))
	private Instructor instructor;

	// private List<Excercise> excersices;
}
