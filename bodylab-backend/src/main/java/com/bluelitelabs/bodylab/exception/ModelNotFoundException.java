package com.bluelitelabs.bodylab.exception;

@SuppressWarnings("serial")
//@ResponseStatus(HttpStatus.NOT_FOUND) Another way to do it
public class ModelNotFoundException extends RuntimeException {

	public ModelNotFoundException(String mensaje) {
		super(mensaje);
	}
}
