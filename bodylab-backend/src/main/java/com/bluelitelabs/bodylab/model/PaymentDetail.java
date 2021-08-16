package com.bluelitelabs.bodylab.model;

import java.time.LocalDateTime;

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
@Table(name = "paymentDetail")
public class PaymentDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentDetailId;

	@ManyToOne
	@JoinColumn(name = "paymentId", nullable = false, foreignKey = @ForeignKey(name = "fk_paymentDetail_payment"))
	private Payment payment;

	@ManyToOne
	@JoinColumn(name = "membershipId", nullable = false, foreignKey = @ForeignKey(name = "fk_paymentDetail_membership"))
	private Membership membership;

	@Column(name = "dateTime")
	private LocalDateTime dateTime;
}
