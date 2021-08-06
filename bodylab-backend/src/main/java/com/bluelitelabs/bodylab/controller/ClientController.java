package com.bluelitelabs.bodylab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluelitelabs.bodylab.model.Client;
import com.bluelitelabs.bodylab.service.IClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private IClientService clientService;

	@GetMapping
	public List<Client> listAll() {
		return this.clientService.listAll();
	}
}
