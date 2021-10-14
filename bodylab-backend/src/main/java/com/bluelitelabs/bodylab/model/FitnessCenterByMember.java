package com.bluelitelabs.bodylab.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "fitnesscenterByMember")
@IdClass(FitnessCenterByMemberPK.class)
public class FitnessCenterByMember {

	@Id
	private FitnessCenter fitnessCenter;

	@Id
	private Member member;

	public FitnessCenter getFitnessCenter() {
		return fitnessCenter;
	}

	public void setFitnessCenter(FitnessCenter fitnessCenter) {
		this.fitnessCenter = fitnessCenter;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
