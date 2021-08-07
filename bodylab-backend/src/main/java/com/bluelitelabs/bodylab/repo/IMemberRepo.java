package com.bluelitelabs.bodylab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluelitelabs.bodylab.model.Member;

public interface IMemberRepo extends JpaRepository<Member, Integer>{

}
