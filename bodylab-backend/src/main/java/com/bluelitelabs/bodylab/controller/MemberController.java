package com.bluelitelabs.bodylab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bluelitelabs.bodylab.model.Member;
import com.bluelitelabs.bodylab.service.IMemberService;

@RestController
@RequestMapping("/members")
public class MemberController {

	@Autowired
	private IMemberService memberService;

	@GetMapping
	public List<Member> listAll() {
		return this.memberService.listAll();
	}
}
