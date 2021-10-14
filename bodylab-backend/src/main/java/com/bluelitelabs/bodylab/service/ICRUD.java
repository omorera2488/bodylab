package com.bluelitelabs.bodylab.service;

import java.util.List;

public interface ICRUD<T, V> {
	T register(T object);

	T update(T objet);

	List<T> listAll();

	T getById(V id);

	boolean delete(V id);
}
