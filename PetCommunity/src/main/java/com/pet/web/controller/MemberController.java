package com.pet.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	// 회원 컨트롤러
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		logger.info("join 메소드 실행(GET)");
		
		return "member/join";
	}
}
