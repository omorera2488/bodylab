package com.bluelitelabs.bodylab.service;

import java.util.List;

import com.bluelitelabs.bodylab.model.Client;


public interface IClientService {

	Client register(Client client);
	Client update(Client client);
	List<Client> listAll();
	Client getById(Integer id);
	void delete(Integer id);
	
}
