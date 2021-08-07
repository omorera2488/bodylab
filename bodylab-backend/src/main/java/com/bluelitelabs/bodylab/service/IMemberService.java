package com.bluelitelabs.bodylab.service;

import java.util.List;

import com.bluelitelabs.bodylab.model.Member;


public interface IMemberService {

	Member register(Member client);
	Member update(Member client);
	List<Member> listAll();
	Member getById(Integer id);
	void delete(Integer id);
	
}
