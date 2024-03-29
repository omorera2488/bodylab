package com.bluelitelabs.bodylab.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "fitnessCenter")
@Schema(description = "Model with Fitness center information")
public class FitnessCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fitnessCenterId;

	@Size(min = 3, message = "The name must be at least 3 characters long.")
	@Column(name = "name", nullable = false, length = 70)
	private String name;

	@Column(name = "logo_URL", nullable = true)
	private String logoURL;

	@Schema(description = "Mostly used to save locations or any other important data")
	@Column(name = "description", nullable = true, length = 150)
	private String description;

	public Integer getFitnessCenterId() {
		return fitnessCenterId;
	}

	public void setFitnessCenterId(Integer fitnessCenterId) {
		this.fitnessCenterId = fitnessCenterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogoURL() {
		return logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fitnessCenterId == null) ? 0 : fitnessCenterId.hashCode());
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
		FitnessCenter other = (FitnessCenter) obj;
		if (fitnessCenterId == null) {
			if (other.fitnessCenterId != null)
				return false;
		} else if (!fitnessCenterId.equals(other.fitnessCenterId))
			return false;
		return true;
	}

}
