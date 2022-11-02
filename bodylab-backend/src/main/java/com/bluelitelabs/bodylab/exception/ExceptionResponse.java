package com.bluelitelabs.bodylab.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {
	private LocalDateTime date;
	private String message;
	private String detail;

	public ExceptionResponse(LocalDateTime date, String message, String detail) {
		super();
		this.date = date;
		this.message = message;
		this.detail = detail;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
