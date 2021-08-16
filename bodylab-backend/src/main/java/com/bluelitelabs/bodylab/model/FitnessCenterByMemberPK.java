package com.bluelitelabs.bodylab.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class FitnessCenterByMemberPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2466047291572115528L;

	@ManyToOne
	@JoinColumn(name = "memberId", nullable = false)
	private Member member;

	@ManyToOne
	@JoinColumn(name = "fitnessCenterId", nullable = false)
	private FitnessCenter fitnessCenter;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fitnessCenter == null) ? 0 : fitnessCenter.hashCode());
		result = prime * result + ((member == null) ? 0 : member.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FitnessCenterByMemberPK other = (FitnessCenterByMemberPK) obj;
		if (fitnessCenter == null) {
			if (other.fitnessCenter != null)
				return false;
		} else if (!fitnessCenter.equals(other.fitnessCenter))
			return false;
		if (member == null) {
			if (other.member != null)
				return false;
		} else if (!member.equals(other.member))
			return false;
		return true;
	}

}
