package com.bluelitelabs.bodylab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluelitelabs.bodylab.model.Client;

public interface IClientRepo extends JpaRepository<Client, Integer>{

}
