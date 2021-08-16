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
@Table(name = "tuition")
public class Tuition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tuitionId;

	@ManyToOne
	@JoinColumn(name = "memberId", nullable = false, foreignKey = @ForeignKey(name = "fk_tuition_member"))
	private Member member;

	@ManyToOne
	@JoinColumn(name = "membershipId", nullable = false, foreignKey = @ForeignKey(name = "fk_tuition_membership"))
	private Membership membership;

	@Column(name = "dateTime")
	private LocalDateTime dateTime;

}
