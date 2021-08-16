package com.bluelitelabs.bodylab.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "promo")
public class Promo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer promoId;

	@Column(name = "code", nullable = false)
	private String code;
	@Column(name = "period", nullable = false)
	private Date period;
	@Column(name = "discount", nullable = false)
	private Double discount;

	public Integer getPromoId() {
		return promoId;
	}

	public void setPromoId(Integer promoId) {
		this.promoId = promoId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
}
