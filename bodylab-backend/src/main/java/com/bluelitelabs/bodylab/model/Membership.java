package com.bluelitelabs.bodylab.model;

import java.util.Date;

public class Membership {
	private Integer membershipTypeId;
	private String name;
	private Date period;
	private Double amount;
	private Double sigupFee;

	private Member member;
}