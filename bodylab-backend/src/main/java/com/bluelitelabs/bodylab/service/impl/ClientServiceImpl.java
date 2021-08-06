package com.bluelitelabs.bodylab.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluelitelabs.bodylab.model.Client;
import com.bluelitelabs.bodylab.repo.IClientRepo;
import com.bluelitelabs.bodylab.service.IClientService;

@Service	
public class ClientServiceImpl implements IClientService{

	
	@Autowired
	private IClientRepo clientRepository;
	
	@Override
	public Client register(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client update(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public List<Client> listAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client getById(Integer id) {
		Optional<Client> opt = clientRepository.findById(id);
		return opt.isPresent() ? opt.get() : new Client();
		
	}

	@Override
	public void delete(Integer id) {
		clientRepository.deleteById(id);
		
	}

}
