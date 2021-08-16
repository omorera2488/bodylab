package com.bluelitelabs.bodylab.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;

	@ManyToOne
	@JoinColumn(name = "memberId", nullable = false, foreignKey = @ForeignKey(name = "fk_payment_member"))
	private Member member;

	@ManyToOne
	@JoinColumn(name = "promoId", nullable = false, foreignKey = @ForeignKey(name = "fk_payment_promo"))
	private Promo promo;

	@Column(name = "totalAmount")
	private Double totalAmount;

	@Column(name = "dateTime")
	private LocalDateTime dateTime;

	@OneToMany(mappedBy = "payment", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<PaymentDetail> details;

}
