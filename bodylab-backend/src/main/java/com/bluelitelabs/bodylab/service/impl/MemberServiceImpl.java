package com.bluelitelabs.bodylab.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluelitelabs.bodylab.model.Member;
import com.bluelitelabs.bodylab.repo.IMemberRepo;
import com.bluelitelabs.bodylab.service.IMemberService;

@Service
public class MemberServiceImpl implements IMemberService {

	@Autowired
	private IMemberRepo memberRepository;

	@Override
	public Member register(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public Member update(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public List<Member> listAll() {
		return memberRepository.findAll();
	}

	@Override
	public Member getById(Integer id) {
		Optional<Member> opt = memberRepository.findById(id);
		return opt.isPresent() ? opt.get() : new Member();

	}

	@Override
	public void delete(Integer id) {
		memberRepository.deleteById(id);

	}

}
