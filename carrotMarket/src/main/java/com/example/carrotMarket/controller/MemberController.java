package com.example.carrotMarket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.carrotMarket.dto.MemberResDto;
import com.example.carrotMarket.service.MemberService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MemberController {

	private final MemberService memberService;

	@GetMapping("/user-info/{id}")
	public ResponseEntity<MemberResDto> getMyProfile(@PathVariable("id") Long id) {

		// todo 로그인 구현 후 추가 로직 필요

		MemberResDto resDto = memberService.getMyProfile(id);
		return ResponseEntity.ok(resDto);
	}
}
